
import javax.swing.*;

public class Question3Main {

	public static void main( String args[] ) {
		JFrame f = new JFrame( "Atelier 2 - Q3 - Maxime Dery" );
		f.setSize( 450, 500 );
		Question3 panneau = new Question3();
		panneau.setVisible( true );
		ImageIcon icone = new ImageIcon( Question3Main.class.getResource( "coke.jpg" ) );
		f.setIconImage( icone.getImage() );
		f.setResizable( false );
		f.setContentPane( panneau );
		f.setVisible( true );

		f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

	}

}
