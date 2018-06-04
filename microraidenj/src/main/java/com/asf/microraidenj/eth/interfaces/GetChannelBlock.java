package com.asf.microraidenj.eth.interfaces;

import com.asf.microraidenj.type.ByteArray;
import java.math.BigInteger;

public interface GetChannelBlock {

  BigInteger get(ByteArray createChannelTxHash);
}
