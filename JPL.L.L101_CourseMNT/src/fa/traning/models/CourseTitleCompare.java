/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fa.traning.models;

import java.util.Comparator;

/**
 *
 * @author Duc Huy
 */
public class CourseTitleCompare implements Comparator<Course>{

    @Override
    public int compare(Course o1, Course o2) {
        return o1.getId().compareToIgnoreCase(o2.getId());
    }
}
