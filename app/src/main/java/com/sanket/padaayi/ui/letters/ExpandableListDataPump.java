package com.sanket.padaayi.ui.letters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> vowels = new ArrayList<String>();
        vowels.add("स्वर शिका");

        List<String> consonants = new ArrayList<String>();
        consonants.add("क चा कुटुंब");
        consonants.add("च चा कुटुंब");
        consonants.add("ट चा कुटुंब");
        consonants.add("त चा कुटुंब");
        consonants.add("प चा कुटुंब");
        consonants.add("य - व");
        consonants.add("श - ह");

        List<String> barakhadi = new ArrayList<String>();
        barakhadi.add("क ची बाराखडी");

        expandableListDetail.put("स्वर",vowels);
        expandableListDetail.put("व्यंजन",consonants);
        expandableListDetail.put("बाराखडी",barakhadi);

        return expandableListDetail;
    }
}
