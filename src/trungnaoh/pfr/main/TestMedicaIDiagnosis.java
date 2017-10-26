package trungnaoh.pfr.main;

import java.util.ArrayList;

import trungnaoh.pfr.model.PictureFuzzyRelation;
import trungnaoh.pfr.utilities.Calculations;
import trungnaoh.pfr.utilities.MedicalDiagnosisCalculationsImpl;

public class TestMedicaIDiagnosis {

  public static void main(String[] args) {
    
    ArrayList<ArrayList<PictureFuzzyRelation>> pNs = new ArrayList<ArrayList<PictureFuzzyRelation>>();
    pNs.add(new ArrayList<PictureFuzzyRelation>());
    pNs.add(new ArrayList<PictureFuzzyRelation>());
    pNs.add(new ArrayList<PictureFuzzyRelation>());
    pNs.add(new ArrayList<PictureFuzzyRelation>());
    ArrayList<ArrayList<PictureFuzzyRelation>> sNd = new ArrayList<ArrayList<PictureFuzzyRelation>>();
    sNd.add(new ArrayList<PictureFuzzyRelation>());
    sNd.add(new ArrayList<PictureFuzzyRelation>());
    sNd.add(new ArrayList<PictureFuzzyRelation>());
    sNd.add(new ArrayList<PictureFuzzyRelation>());
    sNd.add(new ArrayList<PictureFuzzyRelation>());
    ArrayList<ArrayList<Float>> pNd = new ArrayList<ArrayList<Float>>();
    pNd.add(new ArrayList<Float>());
    pNd.add(new ArrayList<Float>());
    pNd.add(new ArrayList<Float>());
    pNd.add(new ArrayList<Float>());

    // initiate data for pNs
    pNs.get(0).add(new PictureFuzzyRelation(0.8f, 0.03f, 0.1f));
    pNs.get(0).add(new PictureFuzzyRelation(0.7f, 0.05f, 0.2f));
    pNs.get(0).add(new PictureFuzzyRelation(0.1f, 0.2f, 0.6f));
    pNs.get(0).add(new PictureFuzzyRelation(0.7f, 0.15f, 0.1f));
    pNs.get(0).add(new PictureFuzzyRelation(0.2f, 0.3f, 0.5f));
    pNs.get(1).add(new PictureFuzzyRelation(0.01f, 0.2f, 0.7f));
    pNs.get(1).add(new PictureFuzzyRelation(0.5f, 0.05f, 0.3f));
    pNs.get(1).add(new PictureFuzzyRelation(0.65f, 0.1f, 0.1f));
    pNs.get(1).add(new PictureFuzzyRelation(0.05f, 0.2f, 0.7f));
    pNs.get(1).add(new PictureFuzzyRelation(0.07f, 0.2f, 0.6f));
    pNs.get(2).add(new PictureFuzzyRelation(0.75f, 0.15f, 0.05f));
    pNs.get(2).add(new PictureFuzzyRelation(0.8f, 0.1f, 0.08f));
    pNs.get(2).add(new PictureFuzzyRelation(0.15f, 0.35f, 0.5f));
    pNs.get(2).add(new PictureFuzzyRelation(0.3f, 0.05f, 0.6f));
    pNs.get(2).add(new PictureFuzzyRelation(0.1f, 0.4f, 0.5f));
    pNs.get(3).add(new PictureFuzzyRelation(0.6f, 0.25f, 0.1f));
    pNs.get(3).add(new PictureFuzzyRelation(0.4f, 0.15f, 0.4f));
    pNs.get(3).add(new PictureFuzzyRelation(0.2f, 0.4f, 0.3f));
    pNs.get(3).add(new PictureFuzzyRelation(0.6f, 0.2f, 0.15f));
    pNs.get(3).add(new PictureFuzzyRelation(0.35f, 0.2f, 0.2f));

    // initiate data for sNd
    sNd.get(0).add(new PictureFuzzyRelation(0.4f, 0.4f, 0.05f));
    sNd.get(0).add(new PictureFuzzyRelation(0.8f, 0.1f, 0.1f));
    sNd.get(0).add(new PictureFuzzyRelation(0.3f, 0.3f, 0.3f));
    sNd.get(0).add(new PictureFuzzyRelation(0.15f, 0.05f, 0.6f));
    sNd.get(0).add(new PictureFuzzyRelation(0.05f, 0.15f, 0.7f));
    sNd.get(1).add(new PictureFuzzyRelation(0.4f, 0.25f, 0.3f));
    sNd.get(1).add(new PictureFuzzyRelation(0.1f, 0.2f, 0.6f));
    sNd.get(1).add(new PictureFuzzyRelation(0.75f, 0.05f, 0.03f));
    sNd.get(1).add(new PictureFuzzyRelation(0.3f, 0.05f, 0.05f));
    sNd.get(1).add(new PictureFuzzyRelation(0.01f, 0.1f, 0.8f));
    sNd.get(2).add(new PictureFuzzyRelation(0.1f, 0.25f, 0.6f));
    sNd.get(2).add(new PictureFuzzyRelation(0.01f, 0.03f, 0.9f));
    sNd.get(2).add(new PictureFuzzyRelation(0.1f, 0.2f, 0.7f));
    sNd.get(2).add(new PictureFuzzyRelation(0.8f, 0.1f, 0.01f));
    sNd.get(2).add(new PictureFuzzyRelation(0.1f, 0.15f, 0.75f));
    sNd.get(3).add(new PictureFuzzyRelation(0.45f, 0.2f, 0.1f));
    sNd.get(3).add(new PictureFuzzyRelation(0.65f, 0.5f, 0.05f));
    sNd.get(3).add(new PictureFuzzyRelation(0.2f, 0.15f, 0.6f));
    sNd.get(3).add(new PictureFuzzyRelation(0.25f, 0.25f, 0.5f));
    sNd.get(3).add(new PictureFuzzyRelation(0.15f, 0.2f, 0.7f));
    sNd.get(4).add(new PictureFuzzyRelation(0.05f, 0.25f, 0.6f));
    sNd.get(4).add(new PictureFuzzyRelation(0.03f, 0.07f, 0.8f));
    sNd.get(4).add(new PictureFuzzyRelation(0.01f, 0.01f, 0.85f));
    sNd.get(4).add(new PictureFuzzyRelation(0.1f, 0.1f, 0.7f));
    sNd.get(4).add(new PictureFuzzyRelation(0.9f, 0.02f, 0.05f));
    
    //Do Picture Fuzzy Relation
    Calculations calculations = new MedicalDiagnosisCalculationsImpl();
    for (int i = 0; i < pNs.size(); i++) {
      for (int k = 0; k < sNd.get(0).size(); k++) {
        pNd.get(i).add(calculations.calS(
            calculations.calDoPositiveM(pNs, sNd, i, k, pNs.get(0).size()),
            calculations.calDoNeutralM(pNs, sNd, i, k, pNs.get(0).size()),
            calculations.calDoNegativeM(pNs, sNd, i, k, pNs.get(0).size())));
        
      System.out.printf("(%.3f)", pNd.get(i).get(k));
      }
      System.out.println();
    }

  }
}
