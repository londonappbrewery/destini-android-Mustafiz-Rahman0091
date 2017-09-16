package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    TextView storyTextView;
    Button buttonTop;
    Button buttonBottom;

    int mStoryIndex;
    StoryAndAnswer[] mStoryAndAnswerBank;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        storyTextView = (TextView) findViewById(R.id.storyTextView);
        buttonTop = (Button) findViewById(R.id.buttonTop);
        buttonBottom = (Button) findViewById(R.id.buttonBottom);

        mStoryAndAnswerBank = new StoryAndAnswer[] {

                new StoryAndAnswer(R.string.T1_Story,R.string.T1_Ans1,R.string.T1_Ans2),
                new StoryAndAnswer(R.string.T2_Story,R.string.T2_Ans1,R.string.T2_Ans2),
                new StoryAndAnswer(R.string.T3_Story,R.string.T3_Ans1,R.string.T3_Ans2)
        };

        if(savedInstanceState!=null){

            mStoryIndex = savedInstanceState.getInt("IndexKey");
            storyTextView.setText(mStoryAndAnswerBank[mStoryIndex].getStoryId());
            buttonTop.setText(mStoryAndAnswerBank[mStoryIndex].getM_ans1_Id());
            buttonBottom.setText(mStoryAndAnswerBank[mStoryIndex].getM_ans2_Id());
        }

        else {

            mStoryIndex=0;
        }

        storyTextView.setText(mStoryAndAnswerBank[mStoryIndex].getStoryId());
        buttonTop.setText(mStoryAndAnswerBank[mStoryIndex].getM_ans1_Id());
        buttonBottom.setText(mStoryAndAnswerBank[mStoryIndex].getM_ans2_Id());


        buttonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int ans=1;
                updateStory(ans);
            }
        });

        buttonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int ans=2;
                updateStory(ans);

            }
        });
    }

    public void updateStory(int ans) {

        if(mStoryIndex==0 && ans==1) {

            storyTextView.setText(mStoryAndAnswerBank[2].getStoryId());
            buttonTop.setText(mStoryAndAnswerBank[2].getM_ans1_Id());
            buttonBottom.setText(mStoryAndAnswerBank[2].getM_ans2_Id());
            mStoryIndex=2;
        }

        else if(mStoryIndex==0 && ans==2) {

            storyTextView.setText(mStoryAndAnswerBank[1].getStoryId());
            buttonTop.setText(mStoryAndAnswerBank[1].getM_ans1_Id());
            buttonBottom.setText(mStoryAndAnswerBank[1].getM_ans2_Id());
            mStoryIndex=1;
        }

        else if(mStoryIndex==2 && ans==1) {

            storyTextView.setText(R.string.T6_End);
            buttonTop.setVisibility(View.GONE);
            buttonBottom.setVisibility(View.GONE);
        }

        else if(mStoryIndex==2 && ans==2) {

            storyTextView.setText(R.string.T5_End);
            buttonTop.setVisibility(View.GONE);
            buttonBottom.setVisibility(View.GONE);
        }

        else if(mStoryIndex==1 && ans==1) {

            storyTextView.setText(mStoryAndAnswerBank[2].getStoryId());
            buttonTop.setText(mStoryAndAnswerBank[2].getM_ans1_Id());
            buttonBottom.setText(mStoryAndAnswerBank[2].getM_ans2_Id());
            mStoryIndex=2;
        }

        else if(mStoryIndex==1 && ans==2) {

            storyTextView.setText(R.string.T4_End);
            buttonTop.setVisibility(View.GONE);
            buttonBottom.setVisibility(View.GONE);
        }

    }

    @Override
    public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt("IndexKey",mStoryIndex);

    }
}
