package com.update.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : liupu.
 * @date : 2018/12/14
 */
public class TeamLeader {
    public void checkNumberOfCourses() {
        List<Course> courseList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }
        System.out.println("在线课程的数量是" + courseList.size());
    }
}
