package trungnaoh.pfr.utilities;

import java.util.ArrayList;

import trungnaoh.pfr.model.PictureFuzzyRelation;

public class Example1CalculationsImpl implements Calculations {

  @Override
  public float calDoPositiveM(
      ArrayList<ArrayList<PictureFuzzyRelation>> pFrArray1,
      ArrayList<ArrayList<PictureFuzzyRelation>> pFrArray2, int a, int b,
      int length) {
    float max = 0;
    for(int j = 0; j < length; j++) {
      if (beta1Cal(pFrArray1.get(a).get(j).getPositive(), pFrArray2.get(j).get(b).getPositive()) > max) {
        max = beta1Cal(pFrArray1.get(a).get(j).getPositive(), pFrArray2.get(j).get(b).getPositive());
      }
    }
    return max;
  }

  @Override
  public float calDoNeutralM(
      ArrayList<ArrayList<PictureFuzzyRelation>> pFrArray1,
      ArrayList<ArrayList<PictureFuzzyRelation>> pFrArray2, int a, int b,
      int length) {
    float min = 1;
    for (int j = 0; j < length; j++) {
      if (Math.min(pFrArray1.get(a).get(j).getNeutral(), pFrArray2.get(j).get(b).getNeutral()) < min) {
        min = Math.min(pFrArray1.get(a).get(j).getNeutral(), pFrArray2.get(j).get(b).getNeutral());
      }
    }
    return min;
  }

  @Override
  public float calDoNegativeM(
      ArrayList<ArrayList<PictureFuzzyRelation>> pFrArray1,
      ArrayList<ArrayList<PictureFuzzyRelation>> pFrArray2, int a, int b,
      int length) {
    float min = 1;
    for (int j = 0; j < length; j++) {
      if (Math.max(pFrArray1.get(a).get(j).getNegative(), pFrArray2.get(j).get(b).getNegative()) < min) {
        min = Math.max(pFrArray1.get(a).get(j).getNegative(), pFrArray2.get(j).get(b).getNegative());
      }
    }
    return min;
  }

  @Override
  public float calDoRefusalM(
      ArrayList<ArrayList<PictureFuzzyRelation>> pFrArray1,
      ArrayList<ArrayList<PictureFuzzyRelation>> pFrArray2, int a, int b,
      int length) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public float calS(float u, float n, float v) {
    // TODO Auto-generated method stub
    return 0;
  }
  
  public float beta1Cal(float a, float b) {
    if (a + b <= 1) {
      return 0;
    } else {
      return a + b - 1;
    }
  }

}
