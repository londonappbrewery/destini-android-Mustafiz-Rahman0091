package com.londonappbrewery.destini;

/**
 * Created by Biplob on 9/17/2017.
 */

public class StoryAndAnswer {

    int mStoryId;
    int m_ans1_Id;
    int m_ans2_Id;

    public StoryAndAnswer(int storyId,int ans1_Id,int ans2_Id) {

        mStoryId = storyId;
        m_ans1_Id = ans1_Id;
        m_ans2_Id = ans2_Id;
    }

    public int getStoryId() {
        return mStoryId;
    }

    public void setStoryId(int storyId) {
        mStoryId = storyId;
    }

    public int getM_ans1_Id() {
        return m_ans1_Id;
    }

    public void setM_ans1_Id(int m_ans1_Id) {
        this.m_ans1_Id = m_ans1_Id;
    }

    public int getM_ans2_Id() {
        return m_ans2_Id;
    }

    public void setM_ans2_Id(int m_ans2_Id) {
        this.m_ans2_Id = m_ans2_Id;
    }
}
