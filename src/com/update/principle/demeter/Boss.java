package com.update.principle.demeter;

/**
 * @author : liupu.
 * @date : 2018/12/14
 */
public class Boss {
    public void commandCheckNumber(TeamLeader teamLeader) {
        teamLeader.checkNumberOfCourses();
    }
}
