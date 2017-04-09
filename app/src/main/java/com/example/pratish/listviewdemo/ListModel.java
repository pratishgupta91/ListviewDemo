package com.example.pratish.listviewdemo;

/**
 * Created by pratish on 09/04/17.
 */

public class ListModel {
    public String m_title;
    public String m_subtitle;

    public ListModel(String title, String subtitle) {
        m_title = title;
        m_subtitle = subtitle;
    }

    public String getTitle() {
        return m_title;
    }

    public String getSubtitle() {
        return m_subtitle;
    }
}
