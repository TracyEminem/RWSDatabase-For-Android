package com.codingdie.rwsdatabase;

import com.codingdie.rwsdatabase.connection.WritableConnection;

/**
 * Created by xupeng on 2016/10/14.
 */
public interface WriteOperator {
    public void exec(WritableConnection writableConnection);
}
