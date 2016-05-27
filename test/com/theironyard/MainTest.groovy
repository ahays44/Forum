package com.theironyard

import org.junit.Test

/**
 * Created by austinhays on 5/26/16.
 */
class MainTest extends groovy.util.GroovyTestCase {
    @Test
    public void parsePosts() throws Exception {
        ArrayList<Post> posts = Main.parsePosts("test.txt")
        assertTrue(posts.get(0).author.equals("alice"));
        assertTrue(posts.get(1).author.equals("bob"));
        assertTrue(posts.get(2).author.equals("charlie"));


    }
}
