package com.newton.wpipe.pipeline;

import com.newton.wpipe.structure.EHR;
import com.newton.wpipe.algorithms.Tokenizer;

/**
 * Created by newton on 8/4/16.
 */
public class nlp {
  public static void main(String[] args) {
    EHR ehr = new EHR();

    ehr.setDoc("There is a knee injury.");

    Tokenizer pipeline = new Tokenizer();

    pipeline.process(ehr);
  }
}
