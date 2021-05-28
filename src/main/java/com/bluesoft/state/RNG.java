package com.bluesoft.state;

import com.bluesoft.common.Tuple;


public interface RNG {

  Tuple<Integer, RNG> nextInt();
}
