
package com.airhacks.ping.boundary;

/**
 *
 * @author airhacks.com
 */
public class Picture {

    @MetaData
    public String name;
    @MetaData
    public int size;

    public String content;

    public Picture(String name, int size, String content) {
        this.name = name;
        this.size = size;
        this.content = content;
    }

}
