package com.newton.wpipe.structure;

import com.newton.wpipe.algorithms.TokenizerInterface;
import com.newton.wpipe.templates.BaseCasInterface;

import java.util.List;

/**
 * Created by newton on 8/4/16.
 *
 * CAS Object as Pojo
 */
public class EHR implements TokenizerInterface {
  public String doc;
  public List<Token> tokens;

  public EHR() {}

  public void setDoc(String doc) { this.doc = doc; }
  public String getDoc() { return this.doc; }

  public void setTokens(List<Token> tokens) {
    this.tokens = tokens;
  }
  public List<Token> getTokens() { return this.tokens; }
}