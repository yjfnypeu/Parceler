
package com.lzh.compiler.parcelerdemo.dispatcheres;

import com.lzh.compiler.parceler.annotation.Arg;
import com.lzh.compiler.parceler.annotation.Dispatcher;

@Dispatcher
public class TestBean{
    @Arg
    String username;
    @Arg
    String password;
}
