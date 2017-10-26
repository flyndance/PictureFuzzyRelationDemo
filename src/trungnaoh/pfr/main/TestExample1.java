package trungnaoh.pfr.main;

import java.util.ArrayList;

import trungnaoh.pfr.model.PictureFuzzyRelation;
import trungnaoh.pfr.utilities.Calculations;
import trungnaoh.pfr.utilities.Example1CalculationsImpl;

public class TestExample1 {

  public static void main(String[] args) {
    ArrayList<ArrayList<PictureFuzzyRelation>> xNy = new ArrayList<ArrayList<PictureFuzzyRelation>>();
    xNy.add(new ArrayList<PictureFuzzyRelation>());
    xNy.add(new ArrayList<PictureFuzzyRelation>());
    xNy.add(new ArrayList<PictureFuzzyRelation>());
    ArrayList<ArrayList<PictureFuzzyRelation>> yNz = new ArrayList<ArrayList<PictureFuzzyRelation>>();
    yNz.add(new ArrayList<PictureFuzzyRelation>());
    yNz.add(new ArrayList<PictureFuzzyRelation>());
    yNz.add(new ArrayList<PictureFuzzyRelation>());
    yNz.add(new ArrayList<PictureFuzzyRelation>());
    ArrayList<ArrayList<PictureFuzzyRelation>> xNz = new ArrayList<ArrayList<PictureFuzzyRelation>>();
    xNz.add(new ArrayList<PictureFuzzyRelation>());
    xNz.add(new ArrayList<PictureFuzzyRelation>());
    xNz.add(new ArrayList<PictureFuzzyRelation>());

    // initiate data for relation between X and Y
    xNy.get(0).add(new PictureFuzzyRelation(0.7f, 0.2f, 0.1f));
    xNy.get(0).add(new PictureFuzzyRelation(0.1f, 0.05f, 0.6f));
    xNy.get(0).add(new PictureFuzzyRelation(0.02f, 0.6f, 0.2f));
    xNy.get(0).add(new PictureFuzzyRelation(0.07f, 0.3f, 0.4f));
    xNy.get(1).add(new PictureFuzzyRelation(0.5f, 0.4f, 0.01f));
    xNy.get(1).add(new PictureFuzzyRelation(0.8f, 0.03f, 0.05f));
    xNy.get(1).add(new PictureFuzzyRelation(0.2f, 0.25f, 0.5f));
    xNy.get(1).add(new PictureFuzzyRelation(0.7f, 0.15f, 0.08f));
    xNy.get(2).add(new PictureFuzzyRelation(0.3f, 0.5f, 0.15f));
    xNy.get(2).add(new PictureFuzzyRelation(0.9f, 0.05f, 0.01f));
    xNy.get(2).add(new PictureFuzzyRelation(0.45f, 0.5f, 0.01f));
    xNy.get(2).add(new PictureFuzzyRelation(0.1f, 0.1f, 0.4f));

    // initiate data for relation between Y and Z
    yNz.get(0).add(new PictureFuzzyRelation(0.75f, 0.1f, 0.15f));
    yNz.get(0).add(new PictureFuzzyRelation(0.5f, 0.25f, 0.01f));
    yNz.get(0).add(new PictureFuzzyRelation(0.45f, 0.4f, 0.01f));
    yNz.get(1).add(new PictureFuzzyRelation(0.2f, 0.4f, 0.3f));
    yNz.get(1).add(new PictureFuzzyRelation(0.36f, 0.6f, 0.05f));
    yNz.get(1).add(new PictureFuzzyRelation(0.2f, 0.2f, 0.6f));
    yNz.get(2).add(new PictureFuzzyRelation(0.06f, 0.24f, 0.4f));
    yNz.get(2).add(new PictureFuzzyRelation(0.55f, 0.09f, 0.3f));
    yNz.get(2).add(new PictureFuzzyRelation(0.7f, 0.1f, 0.1f));
    yNz.get(3).add(new PictureFuzzyRelation(0.3f, 0.04f, 0.6f));
    yNz.get(3).add(new PictureFuzzyRelation(0.4f, 0.3f, 0.25f));
    yNz.get(3).add(new PictureFuzzyRelation(0.4f, 0.2f, 0.1f));

    // Do Picture Fuzzy Relation
    Calculations calculations = new Example1CalculationsImpl();
    for (int i = 0; i < xNy.size(); i++) {
      for (int k = 0; k < yNz.get(0).size(); k++) {
        xNz.get(i).add(new PictureFuzzyRelation(
            calculations.calDoPositiveM(xNy, yNz, i, k, xNy.get(0).size()),
            calculations.calDoNeutralM(xNy, yNz, i, k, xNy.get(0).size()),
            calculations.calDoNegativeM(xNy, yNz, i, k, xNy.get(0).size())));

        System.out.printf("(%.2f, %.2f, %.2f)", 
            xNz.get(i).get(k).getPositive(),
            xNz.get(i).get(k).getNeutral(), 
            xNz.get(i).get(k).getNegative());
      }
      System.out.println();
    }

  }

}
