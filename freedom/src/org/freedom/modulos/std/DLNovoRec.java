/**
 * @version 14/07/2003 <BR>
 * @author Setpoint Inform�tica Ltda./Fernando Oliveira da Silva <BR>
 *
 * Projeto: Freedom <BR>
 *  
 * Pacote: org.freedom.modulos.std <BR>
 * Classe: @(#)DLNovoRec.java <BR>
 * 
 * Este programa � licenciado de acordo com a LPG-PC (Licen�a P�blica Geral para Programas de Computador), <BR>
 * vers�o 2.1.0 ou qualquer vers�o posterior. <BR>
 * A LPG-PC deve acompanhar todas PUBLICA��ES, DISTRIBUI��ES e REPRODU��ES deste Programa. <BR>
 * Caso uma c�pia da LPG-PC n�o esteja dispon�vel junto com este Programa, voc� pode contatar <BR>
 * o LICENCIADOR ou ent�o pegar uma c�pia em: <BR>
 * Licen�a: http://www.lpg.adv.br/licencas/lpgpc.rtf <BR>
 * Para poder USAR, PUBLICAR, DISTRIBUIR, REPRODUZIR ou ALTERAR este Programa � preciso estar <BR>
 * de acordo com os termos da LPG-PC <BR> <BR>
 *
 * Coment�rios sobre a classe...
 */

package org.freedom.modulos.std;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.freedom.componentes.JLabelPad;
import org.freedom.componentes.JPanelPad;
import javax.swing.JScrollPane;

import org.freedom.acao.PostEvent;
import org.freedom.acao.PostListener;
import org.freedom.componentes.GuardaCampo;
import org.freedom.componentes.JTextFieldFK;
import org.freedom.componentes.JTextFieldPad;
import org.freedom.componentes.ListaCampos;
import org.freedom.componentes.Navegador;
import org.freedom.componentes.Tabela;
import org.freedom.funcoes.Funcoes;
import org.freedom.telas.Aplicativo;
import org.freedom.telas.FFDialogo;

public class DLNovoRec extends FFDialogo implements PostListener{

	private static final long serialVersionUID = 1L;

  private JPanelPad pnRec = new JPanelPad(JPanelPad.TP_JPANEL,new BorderLayout());
  private JPanelPad pinCab = new JPanelPad(580,127);
  private JTextFieldPad txtCodCli = new JTextFieldPad(JTextFieldPad.TP_INTEGER,8,0);
  private JTextFieldFK txtDescCli = new JTextFieldFK(JTextFieldPad.TP_STRING,50,0);
  private JTextFieldPad txtCodPlanoPag = new JTextFieldPad(JTextFieldPad.TP_INTEGER,8,0);
  private JTextFieldFK txtDescPlanoPag = new JTextFieldFK(JTextFieldPad.TP_STRING,40,0);
  private JTextFieldPad txtCodBanco = new JTextFieldPad(JTextFieldPad.TP_STRING,3,0);
  private JTextFieldFK txtDescBanco = new JTextFieldFK(JTextFieldPad.TP_STRING,40,0);
  private JTextFieldPad txtCodTipoCob = new JTextFieldPad(JTextFieldPad.TP_INTEGER,8,0);
  private JTextFieldFK txtDescTipoCob = new JTextFieldFK(JTextFieldPad.TP_STRING,40,0);
  private JTextFieldPad txtCodTipoCobItRec = new JTextFieldPad(JTextFieldPad.TP_INTEGER,8,0);
  private JTextFieldFK txtDescTipoCobItRec = new JTextFieldFK(JTextFieldPad.TP_STRING,40,0);
  private JTextFieldPad txtCodBancoItRec = new JTextFieldPad(JTextFieldPad.TP_INTEGER,8,0);
  private JTextFieldFK txtDescBancoItRec = new JTextFieldFK(JTextFieldPad.TP_STRING,40,0);
  private JTextFieldPad txtCodRec = new JTextFieldPad(JTextFieldPad.TP_INTEGER,8,0);
  private JTextFieldPad txtNParcRec = new JTextFieldPad(JTextFieldPad.TP_INTEGER,8,0);
  private JTextFieldPad txtVlrParcItRec = new JTextFieldPad(JTextFieldPad.TP_NUMERIC,15,2);
  private JTextFieldPad txtVlrDescItRec = new JTextFieldPad(JTextFieldPad.TP_NUMERIC,15,2);
  private JTextFieldPad txtDtVencItRec = new JTextFieldPad(JTextFieldPad.TP_DATE,10,0);
  private JTextFieldPad txtVlrParcRec = new JTextFieldPad(JTextFieldPad.TP_NUMERIC,15,2);
  private JTextFieldPad txtDtEmisRec = new JTextFieldPad(JTextFieldPad.TP_DATE,10,0);
  private JTextFieldPad txtDocRec = new JTextFieldPad(JTextFieldPad.TP_INTEGER,10,0);
  private JTextFieldPad txtObs = new JTextFieldPad(JTextFieldPad.TP_STRING,250,0);
  private JTextFieldPad txtStatus = new JTextFieldPad(JTextFieldPad.TP_STRING,2,0);
  private Tabela tabRec = new Tabela();
  private JScrollPane spnTab = new JScrollPane(tabRec);
  private ListaCampos lcReceber = new ListaCampos(this);
  private ListaCampos lcItReceber = new ListaCampos(this);
  private ListaCampos lcCli = new ListaCampos(this,"CL");
  private ListaCampos lcPlanoPag = new ListaCampos(this,"PG");
  private ListaCampos lcBanco = new ListaCampos(this,"BO");
  private ListaCampos lcBancoItRec = new ListaCampos(this,"BO");
  private ListaCampos lcCob = new ListaCampos(this,"TC");
  private ListaCampos lcCobItRec = new ListaCampos(this,"TC");
  private Navegador navRec = new Navegador(false);
  private Navegador navItRec = new Navegador(false);
  public DLNovoRec(Component cOrig) {
  	super(cOrig);
    setTitulo("Novo");
    setAtribos(600,350);
    
    lcItReceber.setMaster(lcReceber);
    lcReceber.adicDetalhe(lcItReceber);
    lcItReceber.setTabela(tabRec);
    
    navRec.setName("Receber");
    lcReceber.setNavegador(navRec);
    navItRec.setName("itpagar");
    lcItReceber.setNavegador(navItRec);

    lcCli.add(new GuardaCampo( txtCodCli, "CodCli", "C�d.cli.",  ListaCampos.DB_PK, false));
    lcCli.add(new GuardaCampo( txtDescCli, "RazCli", "Raz�o social do cliente",  ListaCampos.DB_SI, false));
    lcCli.montaSql(false, "CLIENTE", "VD");
    lcCli.setQueryCommit(false);
    lcCli.setReadOnly(true);
    txtCodCli.setTabelaExterna(lcCli);
    txtCodCli.setFK(true);
    txtCodCli.setNomeCampo("CodCli");

    lcPlanoPag.add(new GuardaCampo( txtCodPlanoPag, "CodPlanoPag", "C�d.p.pag.", ListaCampos.DB_PK, false));
    lcPlanoPag.add(new GuardaCampo( txtDescPlanoPag, "DescPlanoPag", "Descri��o do plano de pagamento",  ListaCampos.DB_SI, false));
    lcPlanoPag.montaSql(false, "PLANOPAG", "FN");
    lcPlanoPag.setQueryCommit(false);
    lcPlanoPag.setReadOnly(true);
    txtCodPlanoPag.setTabelaExterna(lcPlanoPag);
    txtCodPlanoPag.setFK(true);
    txtCodPlanoPag.setNomeCampo("CodPlanoPag");

    lcBanco.add(new GuardaCampo( txtCodBanco, "CodBanco", "C�d.banco",  ListaCampos.DB_PK, false));
    lcBanco.add(new GuardaCampo( txtDescBanco, "NomeBanco", "Nome do banco", ListaCampos.DB_SI, false));
    lcBanco.montaSql(false, "BANCO", "FN");
    lcBanco.setQueryCommit(false);
    lcBanco.setReadOnly(true);
    txtCodBanco.setTabelaExterna(lcBanco);
    txtCodBanco.setFK(true);
    txtCodBanco.setNomeCampo("CodBanco");
    
    //tipo de cobran�a
    lcCob.add( new GuardaCampo( txtCodTipoCob, "CodTipoCob", "C�d.Tip.Cob",ListaCampos.DB_PK, false ));
    lcCob.add( new GuardaCampo( txtDescTipoCob,"DescTipoCob", "Descri��o do tipo de cobran�a", ListaCampos.DB_SI, false));
    lcCob.montaSql(false, "TIPOCOB", "FN");
    lcCob.setQueryCommit(false);
    lcCob.setReadOnly(true);
    txtCodTipoCob.setTabelaExterna(lcCob);
    txtCodTipoCob.setFK(true);
    txtCodTipoCob.setNomeCampo("CodTipoCob");

    //tipo de cobran�a
    lcCobItRec.add( new GuardaCampo( txtCodTipoCobItRec, "CodTipoCob", "C�d.Tip.Cob",ListaCampos.DB_PK, false ));
    lcCobItRec.add( new GuardaCampo( txtDescTipoCobItRec,"DescTipoCob", "Descri��o tipo de cobran�a", ListaCampos.DB_SI, false));
    lcCobItRec.montaSql(false, "TIPOCOB", "FN");
    lcCobItRec.setQueryCommit(false);
    lcCobItRec.setReadOnly(true);
    txtCodTipoCobItRec.setTabelaExterna(lcCobItRec);
    txtCodTipoCobItRec.setFK(true);
    txtCodTipoCobItRec.setNomeCampo("CodTipoCob");
    txtDescTipoCobItRec.setTabelaExterna( lcCobItRec );
    txtDescTipoCobItRec.setLabel( "Descri��o do tipo de cobran�a" );
    //txtDescTipoCobItRec.set
    
    // banco
    lcBancoItRec.add( new GuardaCampo( txtCodBancoItRec, "CodBanco", "C�d.Tip.Cob",ListaCampos.DB_PK, false ));
    lcBancoItRec.add( new GuardaCampo( txtDescBancoItRec,"NomeBanco", "Descri��o tipo de cobran�a", ListaCampos.DB_SI, false));
    lcBancoItRec.montaSql(false, "Banco", "FN");
    lcBancoItRec.setQueryCommit(false);
    lcBancoItRec.setReadOnly(true);
    txtCodBancoItRec.setTabelaExterna(lcBancoItRec);
    txtCodBancoItRec.setFK(true);
    txtCodBancoItRec.setNomeCampo("CodBanco");
    txtDescBancoItRec.setTabelaExterna( lcBancoItRec );
    txtDescBancoItRec.setLabel( "Descri��o do Banco" );
    
    lcReceber.add(new GuardaCampo( txtCodRec, "CodRec", "C�d.rec.", ListaCampos.DB_PK, true));
    lcReceber.add(new GuardaCampo( txtCodCli, "CodCli", "C�d.cli.",  ListaCampos.DB_FK,true));
    lcReceber.add(new GuardaCampo( txtCodPlanoPag, "CodPlanoPag", "C�d.p.pag.",  ListaCampos.DB_FK,true));
    lcReceber.add(new GuardaCampo( txtCodBanco, "CodBanco", "C�d.banco",  ListaCampos.DB_FK, false));
    lcReceber.add(new GuardaCampo( txtCodTipoCob, "CodTipoCob", "C�d.tp.cob.",  ListaCampos.DB_FK, false));
    lcReceber.add(new GuardaCampo( txtVlrParcRec, "VlrParcRec", "Valor parc.",  ListaCampos.DB_SI,true));
    lcReceber.add(new GuardaCampo( txtVlrParcRec, "VlrAPagRec", "Valor a rec.",  ListaCampos.DB_SI,true));
    lcReceber.add(new GuardaCampo( txtVlrParcRec, "VlrRec", "Valor tot.",  ListaCampos.DB_SI,true));
    lcReceber.add(new GuardaCampo( txtDtEmisRec, "DataRec", "Dt.emiss�o",  ListaCampos.DB_SI,true));
    lcReceber.add(new GuardaCampo( txtDocRec, "DocRec", "N.doc.",  ListaCampos.DB_SI,true));
    lcReceber.add(new GuardaCampo( txtObs, "ObsRec", "Obs.",  ListaCampos.DB_SI,false));
    lcReceber.add(new GuardaCampo( txtStatus, "StatusRec", "Status",  ListaCampos.DB_SI, false));
    //lcReceber.add(new GuardaCampo( txtCodTipCob, "CodTipoCob", "C�d.banco",  ListaCampos.DB_FK, false));
    lcReceber.montaSql(true,"RECEBER", "FN");
    
    txtNParcRec.setNomeCampo("NParcRec");
    lcItReceber.add(new GuardaCampo( txtNParcRec, "NParcItRec", "N.parc.",  ListaCampos.DB_PK, false));
    lcItReceber.add(new GuardaCampo( txtVlrParcItRec, "VlrParcItRec", "Valor tot.",  ListaCampos.DB_SI,false));
    lcItReceber.add(new GuardaCampo( txtDtVencItRec, "DtVencItRec", "Dt.vencto.",  ListaCampos.DB_SI,false));
    lcItReceber.add(new GuardaCampo( txtVlrDescItRec, "VlrDescItRec", "Valor desc.",  ListaCampos.DB_SI,false));
    lcItReceber.add(new GuardaCampo( txtCodTipoCobItRec,"CodTipoCob", "Cod.Tipo.Cob", ListaCampos.DB_FK, txtDescTipoCobItRec, false));
    lcItReceber.add(new GuardaCampo( txtCodBancoItRec,"CodBanco", "Cod.Banco", ListaCampos.DB_FK, txtDescBancoItRec, false));
   
    lcItReceber.montaSql(false, "ITRECEBER", "FN");
    lcItReceber.setQueryCommit(false);
    txtNParcRec.setListaCampos(lcItReceber);
    txtVlrParcItRec.setListaCampos(lcItReceber);
    txtVlrDescItRec.setListaCampos(lcItReceber);
    txtDtVencItRec.setListaCampos(lcItReceber);
    txtCodTipoCobItRec.setListaCampos(lcItReceber);
    txtCodBancoItRec.setListaCampos( lcItReceber );
    
    lcItReceber.montaTab();
    tabRec.setTamColuna( 70, 4 );
    tabRec.setTamColuna( 200, 5 );
    tabRec.setTamColuna( 70, 6 );
    tabRec.setTamColuna( 250, 7 );
  
    // Adiciona o mouse listener para que possa editar os itens.
    tabRec.addMouseListener( 
      new MouseAdapter() {
        public void mouseClicked(MouseEvent mevt) {
          if ((mevt.getClickCount() == 2) & (tabRec.getLinhaSel() >= 0)) {
             lcItReceber.edit();
             DLFechaParcela dl = new DLFechaParcela(DLNovoRec.this, con, txtVlrParcItRec.getVlrBigDecimal(),
            		 txtDtVencItRec.getVlrDate(), txtVlrDescItRec.getVlrBigDecimal(), txtCodTipoCobItRec.getVlrInteger(),
            		 txtCodBancoItRec.getVlrString());
             dl.setVisible(true);
            if (dl.OK) {
              txtVlrParcItRec.setVlrBigDecimal((BigDecimal)dl.getValores()[0]);
              txtDtVencItRec.setVlrDate((Date)dl.getValores()[1]);
              txtVlrDescItRec.setVlrBigDecimal((BigDecimal)dl.getValores()[2]);
              txtCodTipoCobItRec.setVlrInteger( (Integer) dl.getValores()[3] );
              txtCodBancoItRec.setVlrString( (String) dl.getValores()[4]);
              lcItReceber.post();
              //Atualiza lcReceber              
              if (lcReceber.getStatus() == ListaCampos.LCS_EDIT) 
                lcReceber.post(); // Caso o lcReceber estaja como edit executa o post que atualiza
              else 
                lcReceber.carregaDados(); //Caso n�o, atualiza
            }
            else {
              dl.dispose();
              lcItReceber.cancel(false);
            }
            dl.dispose();
          }
        }
      }
    );
    c.add(pnRec);
    
    pnRec.add(pinCab,BorderLayout.NORTH);
    pnRec.add(spnTab,BorderLayout.CENTER);

    setPainel(pinCab);
    adic(new JLabelPad("C�d.cli."),7,0,250,20);
    adic(txtCodCli,7,20,80,20);
    adic(new JLabelPad("Raz�o social do cliente"),90,0,250,20);
    adic(txtDescCli,90,20,197,20);
    adic(new JLabelPad("C�d.p.pag."),290,0,250,20);
    adic(txtCodPlanoPag,290,20,77,20);
    adic(new JLabelPad("Descri��o do plano de pagto."),370,0,250,20);
    adic(txtDescPlanoPag,370,20,200,20);
    adic(new JLabelPad("Cod.Tip.Cob."),7,40,250,20);
    adic(txtCodTipoCob,7,60,80,20);
    adic(new JLabelPad("Descri��o Tipo Cobran�a"),90,40,200,20);
    adic(txtDescTipoCob,90,60,197,20);
    adic(new JLabelPad("C�d.banco"),290,40,250,20);
    adic(txtCodBanco,290,60,80,20);
    adic(new JLabelPad("Descri�ao do banco"),370,40,250,20);
    adic(txtDescBanco,370,60,200,20);
    adic(new JLabelPad("Valor"),7,80,107,20);
    adic(txtVlrParcRec,7,100,90,20);
    adic(new JLabelPad("Data de Emiss�o"),100,80,100,20);
    adic(txtDtEmisRec,100,100,100,20);
    adic(new JLabelPad("Doc."),203,80,80,20);
    adic(txtDocRec,203,100,85,20);
    adic(new JLabelPad("Observa��es"),290,80,300,20);
    adic(txtObs,290,100,282,20);
    
    lcReceber.addPostListener(this);
  }
  private void testaCodRec() { //Traz o verdadeiro n�mero do codrec
    PreparedStatement ps = null;
    ResultSet rs = null;
    try {
		ps = con.prepareStatement("SELECT * FROM SPGERANUM(?,?,?)");
		ps.setInt(1,Aplicativo.iCodEmp);
		ps.setInt(2,ListaCampos.getMasterFilial("FNRECEBER"));
		ps.setString(3,"RC");
		rs = ps.executeQuery();
		rs.next();
		txtCodRec.setVlrString(rs.getString(1));
//      rs.close();
//      ps.close();
		//if (!con.getAutoCommit())
//      con.commit();
    }
    catch (SQLException err) {
		Funcoes.mensagemErro(this,"Erro ao confirmar c�digo da conta a receber!\n"+err.getMessage(),true,con,err);
    }
  }
  public void beforePost(PostEvent evt) { 
    if ((evt.getListaCampos().equals(lcReceber)) & (lcReceber.getStatus() == ListaCampos.LCS_INSERT)) {
        testaCodRec();
        txtStatus.setVlrString("R1");
    }
  }
  public void afterPost(PostEvent evt) { }
  public void actionPerformed(ActionEvent evt) {
    if (evt.getSource() == btOK) {
      if (txtDtEmisRec.getVlrString().length() < 10) {
		Funcoes.mensagemErro(this,"Data de emiss�o � requerido!");
      }
      else {
        if (lcReceber.getStatus() == ListaCampos.LCS_INSERT) {
          lcReceber.post();
        }
        else {
          super.actionPerformed(evt);
        }
      }
    }
    else {
      super.actionPerformed(evt);
    }
  }
  public void setConexao(Connection cn) {
    super.setConexao(cn);
    lcCli.setConexao(cn);
    lcPlanoPag.setConexao(cn);
    lcReceber.setConexao(cn);
    lcItReceber.setConexao(cn);
    lcBanco.setConexao(cn);
    lcCob.setConexao( cn );
    lcCobItRec.setConexao( cn );
    lcBancoItRec.setConexao( cn );
    lcReceber.insert(true);
  }
}
