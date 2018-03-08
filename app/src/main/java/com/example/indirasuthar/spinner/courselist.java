package com.example.indirasuthar.spinner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by indirasuthar on 08/03/18.
 */

public class courselist {

    List<String> chooseCourse(String degree)
    {
        List<String> type = new ArrayList<String>();
        {
            if(degree.contentEquals("Arts"))
            {
                type.add("B.Com");
                type.add("BBM");
                type.add("B.Com(Hons");
            }

            else if(degree.contentEquals("Science"))
            {
                type.add("BSc(IT)");
                type.add("BSC (CS)");
            }

            else
            {
                type.add("BTECH");
                type.add("BE");
            }

        }
        return  type;
    }


}
