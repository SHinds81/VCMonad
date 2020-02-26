package abraxas;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class Nous extends Application {
	@Override
	public void start(Stage stage) {

		int aeon = 25;
		aeon = (aeon * aeon) + aeon;
		int omega = aeon;
		System.out.println("Aeon test: " + aeon);

		Rectangle archonDemiurge = new Rectangle();
		Rectangle godDemiurge = new Rectangle();
		Rectangle demonDemiurge = new Rectangle();
		Rectangle alphaDemiurge = new Rectangle();
		Rectangle betaDemiurge = new Rectangle();
		Rectangle rhoDemiurge = new Rectangle();
		Rectangle sigmaDemiurge = new Rectangle();
		Rectangle xiDemiurge = new Rectangle();
		Rectangle ultimateDemiurge = new Rectangle();

		Rectangle archonMonad = new Rectangle();
		Rectangle godMonad = new Rectangle();
		Rectangle demonMonad = new Rectangle();
		Rectangle alphaMonad = new Rectangle();
		Rectangle betaMonad = new Rectangle();
		Rectangle rhoMonad = new Rectangle();
		Rectangle sigmaMonad = new Rectangle();
		Rectangle xiMonad = new Rectangle();
		Rectangle ultimateMonad = new Rectangle();

		int[] aeonOne;
		aeonOne = new int[9];

		for (int creator = 0; creator < 9; creator++) {
			aeon = aeon / 2;
			aeonOne[creator] = aeon;
			System.out.println("At this stage (" + creator + ") aeon is at: " + aeonOne[creator]);
		}

		Text artist = new Text();
		Text title = new Text();

		artist.setText("V\nO\nI\nD\nC\nH\nR\nI\nS\nT");
		artist.setFont(Font.font("impact", FontWeight.BOLD, FontPosture.REGULAR, aeonOne[2]));
		artist.setTextAlignment(TextAlignment.CENTER);
		artist.setX(aeonOne[2] - aeonOne[4]);
		artist.setY(aeonOne[1] - aeonOne[2]);
		artist.setLineSpacing(-aeonOne[3] + aeonOne[7]);
		artist.setFill(Color.WHITE);

		title.setText("M\nO\nN\nA\nD");
		title.setFont(Font.font("impact", FontWeight.BOLD, FontPosture.REGULAR, aeonOne[2]));
		title.setTextAlignment(TextAlignment.CENTER);
		title.setX(omega - aeonOne[2] - aeonOne[4]);
		title.setY(aeonOne[0] + aeonOne[3] + aeonOne[4]);
		title.setLineSpacing(-aeonOne[3] + aeonOne[7]);
		title.setFill(Color.BLACK);

		int demiurgeArchon = 0;
		archonDemiurge.setX(demiurgeArchon);
		archonDemiurge.setY(0.0f);
		archonDemiurge.setWidth(aeonOne[0]);
		archonDemiurge.setHeight(omega);
		archonDemiurge.setFill(Color.BLACK);

		int monadArchon = omega - aeonOne[0];
		archonMonad.setX(monadArchon);
		archonMonad.setY(0.0f);
		archonMonad.setWidth(aeonOne[0]);
		archonMonad.setHeight(omega);
		archonMonad.setFill(Color.WHITE);

		int demiurgeGod = demiurgeArchon + aeonOne[1];
		godDemiurge.setX(demiurgeGod);
		godDemiurge.setY(0.0f);
		godDemiurge.setWidth(aeonOne[1]);
		godDemiurge.setHeight(omega);
		godDemiurge.setFill(Color.WHITE);

		godMonad.setX(monadArchon);
		godMonad.setY(0.0f);
		godMonad.setWidth(aeonOne[1]);
		godMonad.setHeight(omega);
		godMonad.setFill(Color.BLACK);

		int demiurgeDemon = demiurgeGod + aeonOne[2];
		demonDemiurge.setX(demiurgeDemon);
		demonDemiurge.setY(0.0f);
		demonDemiurge.setWidth(aeonOne[2]);
		demonDemiurge.setHeight(omega);
		demonDemiurge.setFill(Color.BLACK);

		demonMonad.setX(monadArchon);
		demonMonad.setY(0.0f);
		demonMonad.setWidth(aeonOne[2]);
		demonMonad.setHeight(omega);
		demonMonad.setFill(Color.WHITE);

		int demiurgeAlpha = demiurgeDemon + aeonOne[3];
		alphaDemiurge.setX(demiurgeAlpha);
		alphaDemiurge.setY(0.0f);
		alphaDemiurge.setWidth(aeonOne[3]);
		alphaDemiurge.setHeight(omega);
		alphaDemiurge.setFill(Color.WHITE);

		alphaMonad.setX(monadArchon);
		alphaMonad.setY(0.0f);
		alphaMonad.setWidth(aeonOne[3]);
		alphaMonad.setHeight(omega);
		alphaMonad.setFill(Color.BLACK);

		int demiurgeBeta = demiurgeAlpha + aeonOne[4];
		betaDemiurge.setX(demiurgeBeta);
		betaDemiurge.setY(0.0f);
		betaDemiurge.setWidth(aeonOne[4]);
		betaDemiurge.setHeight(omega);
		betaDemiurge.setFill(Color.BLACK);

		betaMonad.setX(monadArchon);
		betaMonad.setY(0.0f);
		betaMonad.setWidth(aeonOne[4]);
		betaMonad.setHeight(omega);
		betaMonad.setFill(Color.WHITE);

		int demiurgeRho = demiurgeBeta + aeonOne[5];
		rhoDemiurge.setX(demiurgeRho);
		rhoDemiurge.setY(0.0f);
		rhoDemiurge.setWidth(aeonOne[5]);
		rhoDemiurge.setHeight(omega);
		rhoDemiurge.setFill(Color.WHITE);

		rhoMonad.setX(monadArchon);
		rhoMonad.setY(0.0f);
		rhoMonad.setWidth(aeonOne[5]);
		rhoMonad.setHeight(omega);
		rhoMonad.setFill(Color.BLACK);

		int demiurgeSigma = demiurgeRho + aeonOne[6];
		sigmaDemiurge.setX(demiurgeSigma);
		sigmaDemiurge.setY(0.0f);
		sigmaDemiurge.setWidth(aeonOne[6]);
		sigmaDemiurge.setHeight(omega);
		sigmaDemiurge.setFill(Color.BLACK);

		sigmaMonad.setX(monadArchon);
		sigmaMonad.setY(0.0f);
		sigmaMonad.setWidth(aeonOne[6]);
		sigmaMonad.setHeight(omega);
		sigmaMonad.setFill(Color.WHITE);

		int demiurgeXi = demiurgeSigma + aeonOne[7];
		xiDemiurge.setX(demiurgeXi);
		xiDemiurge.setY(0.0f);
		xiDemiurge.setWidth(aeonOne[7]);
		xiDemiurge.setHeight(omega);
		xiDemiurge.setFill(Color.WHITE);

		xiMonad.setX(monadArchon);
		xiMonad.setY(0.0f);
		xiMonad.setWidth(aeonOne[7]);
		xiMonad.setHeight(omega);
		xiMonad.setFill(Color.BLACK);

		int demiurgeUlimate = demiurgeXi + aeonOne[8];
		ultimateDemiurge.setX(demiurgeUlimate);
		ultimateDemiurge.setY(0.0f);
		ultimateDemiurge.setWidth(aeonOne[8]);
		ultimateDemiurge.setHeight(omega);
		ultimateDemiurge.setFill(Color.BLACK);

		ultimateMonad.setX(monadArchon);
		ultimateMonad.setY(0.0f);
		ultimateMonad.setWidth(aeonOne[8]);
		ultimateMonad.setHeight(omega);
		ultimateMonad.setFill(Color.WHITE);

		Group root = new Group(archonDemiurge, archonMonad, godDemiurge, godMonad, demonDemiurge, demonMonad,
				alphaDemiurge, alphaMonad, betaDemiurge, betaMonad, rhoDemiurge, rhoMonad, sigmaDemiurge, sigmaMonad,
				xiDemiurge, xiMonad, ultimateDemiurge, ultimateMonad, artist, title);

		Scene scene = new Scene(root, omega, omega);

		stage.setTitle("Voidchrist: Monad");

		stage.setScene(scene);

		stage.show();
	}

	public static void main(String args[]) {
		launch(args);
	}
}