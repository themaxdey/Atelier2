import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class Question3 extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton bouton1 = new JButton( "Ouvrir" );
	private JButton bouton2 = new JButton( "Sauvegarder" );
	private ButtonGroup groupRadio = new ButtonGroup();
	private ButtonGroup groupCheckBox = new ButtonGroup();
	private JRadioButton tempsPleinRadio = new JRadioButton( "Temps Plein" );
	private JRadioButton tempsPartielRadio = new JRadioButton( "Temps Partiel" );
	private JRadioButton ContratRadio = new JRadioButton( "À contrat" );
	private JCheckBox interfaceBox = new JCheckBox( "Interface" );
	private JCheckBox webBox = new JCheckBox( "Web et base de données" );
	private JCheckBox analyseBox = new JCheckBox( "Analyse" );
	private JTextArea multiLignes;

	public Question3() {

		super();
		JPanel panneau1 = new JPanel();
		JPanel panneau2 = new JPanel();
		JPanel panneau3 = new JPanel();
		JPanel panneau4 = new JPanel();
		setSize( 400, 300 );
		setLayout( new FlowLayout() );

		panneau1.add( bouton1 );
		panneau1.add( bouton2 );

		groupCheckBox.add( interfaceBox );
		groupCheckBox.add( webBox );
		groupCheckBox.add( analyseBox );
		panneau2.add( interfaceBox );
		panneau2.add( webBox );
		panneau2.add( analyseBox );

		multiLignes = new JTextArea();
		JScrollPane multilignesScrollPane = ConstrureZoneTexte( multiLignes );
		panneau3.add( multilignesScrollPane );
		tempsPartielRadio.setSelected( true );

		groupRadio.add( tempsPleinRadio );
		groupRadio.add( tempsPartielRadio );
		groupRadio.add( ContratRadio );
		panneau4.add( tempsPleinRadio );
		panneau4.add( tempsPartielRadio );
		panneau4.add( ContratRadio );

		add( panneau1 );
		add( panneau2 );
		add( panneau3 );
		add( panneau4 );

	}

	private JScrollPane ConstrureZoneTexte( JTextArea multiLignes ) {
		
		multiLignes.setForeground( Color.MAGENTA );
		multiLignes.setFont( new Font( "Times New Roman", Font.BOLD, 16 ) );
		multiLignes.setText( "Zone de texte sur plusieurs lignes" );
		JScrollPane multilignesScrollPane = new JScrollPane( multiLignes );
		multilignesScrollPane.setVerticalScrollBarPolicy( ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS );
		multilignesScrollPane.setPreferredSize( new Dimension( 250, 250 ) );

		return multilignesScrollPane;
	}

	public void setMultiLignes( String message ) {
		multiLignes.setText( message );
	}

}
