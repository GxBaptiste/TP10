package TP11;

import TP15.Surfacable;
import TP20.ImpressionHorsLimiteException;

public class Main {

	public static void main(String[] args) throws ImpressionHorsLimiteException {


		// FigureUtil.getRandomRond().affiche() elelelelel;
		// FigureUtil.getRandomRectangle().affiche();
		for (int i = 0; i < 10; i++) {
			System.out.println("\nRANDOM FIGURE : \n");
			FigureUtil.getRandomFigure().affiche();
			System.out.println("\nRANDOM SURFACE : \n");
			Surfacable n = FigureUtil.getRandomSurfacable();
			n.affiche();
			System.out.println("la surface est de : " + n.surface());

		}
	}
}
