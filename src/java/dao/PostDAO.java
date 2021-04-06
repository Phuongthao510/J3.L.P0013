/*
 * J3.L.P0013
 * Sushi
 *
 *Record of change:
 *DATE                  Version             AUTHOR                  DESCRIPTION
 *2021-02-21             1.0                ThaoHP                First implement
 */
package dao;

import entity.Post;

/**
 * This class contains method find post of page from Post table in database The
 * method will throw an object of <code>java.lang.Exception</code> class if
 * there is any error occurring when finding data
 *
 * @author Five Swag
 */
public interface PostDAO {

    /**
     * This method get the lastest post
     *
     * @return the lastest post
     * @throws Exception Exception when do method
     */
    public Post getLatestPost() throws Exception;

    /**
     * This method get the post by id
     *
     * @param id
     * @return the post
     * @throws Exception Exception when do method
     */
    public Post getPostByID(int id) throws Exception;
}
