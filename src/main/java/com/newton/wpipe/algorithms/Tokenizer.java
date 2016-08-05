package com.newton.wpipe.algorithms;

import com.newton.wpipe.templates.AnalysisEngine;
import com.newton.wpipe.templates.BaseCasInterface;
import com.newton.wpipe.structure.Token;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by newton on 8/4/16.
 */
public class Tokenizer extends AnalysisEngine {
  public void process(BaseCasInterface cas) {
    TokenizerInterface tokenizerInterface = (TokenizerInterface) cas;

    // develop a source mapping here
    String[] tokens = tokenizerInterface.getDoc().split(" ");

    List<Token> tokenList = new ArrayList();

    for (String s : tokens) {
      tokenList.add(new Token(s, 0, 0));
    }

    tokenizerInterface.setTokens(tokenList);
  }
}
