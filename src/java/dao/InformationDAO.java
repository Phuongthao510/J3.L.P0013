/*
 * J3.L.P0013
 * Sushi
 *
 *Record of change:
 *DATE                  Version             AUTHOR                  DESCRIPTION
 *2021-02-21             1.0                ThaoHP                First implement
 */
package dao;

import entity.Information;

/**
 * This class contains method find Information from Information table in
 * database The method will throw an object of <code>java.lang.Exception</code>
 * class if there is any error occurring when finding data
 *
 * @author Five Swag
 */
public interface InformationDAO {

    /**
     * Get the Information from database
     *
     * @return Information of page
     * @throws Exception Exception when do method
     */
    public Information getInformation() throws Exception;
}
