package com.example.android.comicsquiz;

import android.content.Intent;
import android.content.pm.LabeledIntent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.style.IconMarginSpan;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.orientation;
import static android.R.attr.privateImeOptions;
import static android.R.attr.width;
import static com.example.android.comicsquiz.R.id.cover;


public class MainActivity extends AppCompatActivity {

    int currentQuestion = 1;
    int scores = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setFont();
    }


    // Set fonts to activity
    public void setFont() {
        Button findTextBegin = (Button) findViewById(R.id.begin_text);
        TextView findTitleOfApp = (TextView) findViewById(R.id.quiz_title);
        EditText findEditTextOfQuestionOne = (EditText) findViewById(R.id.name_filed_question_1);
        TextView findCorrectAnswerOne = (TextView) findViewById(R.id.correct_answer_1);
        RadioButton findJokerRadioOne = (RadioButton) findViewById(R.id.jokerradio_1);
        RadioButton findJokerRadioTwo = (RadioButton) findViewById(R.id.jokerradio_2);
        RadioButton findJokerRadioThree = (RadioButton) findViewById(R.id.jokerradio_3);
        RadioButton findJokerRadioFour = (RadioButton) findViewById(R.id.jokerradio_4);
        CheckBox findJusticeLEagueOne = (CheckBox) findViewById(R.id.justiceLeague_1);
        CheckBox findJusticeLEagueTwo = (CheckBox) findViewById(R.id.justiceLeague_2);
        CheckBox findJusticeLEagueThree = (CheckBox) findViewById(R.id.justiceLeague_3);
        CheckBox findJusticeLFour = (CheckBox) findViewById(R.id.justiceLeague_4);
        RadioButton findStormRadioOne = (RadioButton) findViewById(R.id.stormradio_1);
        RadioButton findStormRadioTwo = (RadioButton) findViewById(R.id.stormradio_2);
        RadioButton findStormRadioThree = (RadioButton) findViewById(R.id.stormradio_3);
        RadioButton findStormRadioFour = (RadioButton) findViewById(R.id.stormradio_4);
        EditText findEditTextOfQuestionFive = (EditText) findViewById(R.id.name_filed_question_5);
        TextView findCorrectAnswerFive = (TextView) findViewById(R.id.correct_answer_5);
        CheckBox findSpiderManOne = (CheckBox) findViewById(R.id.spidermanBox_1);
        CheckBox findSpiderManTwo = (CheckBox) findViewById(R.id.spidermanBox_2);
        CheckBox findSpiderManThree = (CheckBox) findViewById(R.id.spidermanBox_3);
        CheckBox findSpiderManFour = (CheckBox) findViewById(R.id.spidermanBox_4);
        RadioButton findIronManOne = (RadioButton) findViewById(R.id.ironmanradio_1);
        RadioButton findIronManTwo = (RadioButton) findViewById(R.id.ironmanradio_2);
        RadioButton findIronManThree = (RadioButton) findViewById(R.id.ironmanradio_3);
        RadioButton findIronManFour = (RadioButton) findViewById(R.id.ironmanradio_4);
        EditText findEditTextOfQuestionEight = (EditText) findViewById(R.id.name_filed_question_8);
        TextView findCorrectAnswerEight = (TextView) findViewById(R.id.correct_answer_8);
        Button findSubmitButton = (Button) findViewById(R.id.submitButton);
        Button findBackToQuizButton = (Button) findViewById(R.id.backToQuiz);
        Button findRestartButton = (Button) findViewById(R.id.restartQuiz);

        Typeface typefaceOfBegin = Typeface.createFromAsset(getAssets(), "fonts/bangers.ttf");

        findTextBegin.setTypeface(typefaceOfBegin);
        findTitleOfApp.setTypeface(typefaceOfBegin);
        findEditTextOfQuestionOne.setTypeface(typefaceOfBegin);
        findCorrectAnswerOne.setTypeface(typefaceOfBegin);
        findJokerRadioOne.setTypeface(typefaceOfBegin);
        findJokerRadioTwo.setTypeface(typefaceOfBegin);
        findJokerRadioThree.setTypeface(typefaceOfBegin);
        findJokerRadioFour.setTypeface(typefaceOfBegin);
        findJusticeLEagueOne.setTypeface(typefaceOfBegin);
        findJusticeLEagueTwo.setTypeface(typefaceOfBegin);
        findJusticeLEagueThree.setTypeface(typefaceOfBegin);
        findJusticeLFour.setTypeface(typefaceOfBegin);
        findStormRadioOne.setTypeface(typefaceOfBegin);
        findStormRadioTwo.setTypeface(typefaceOfBegin);
        findStormRadioThree.setTypeface(typefaceOfBegin);
        findStormRadioFour.setTypeface(typefaceOfBegin);
        findEditTextOfQuestionFive.setTypeface(typefaceOfBegin);
        findCorrectAnswerFive.setTypeface(typefaceOfBegin);
        findSpiderManOne.setTypeface(typefaceOfBegin);
        findSpiderManTwo.setTypeface(typefaceOfBegin);
        findSpiderManThree.setTypeface(typefaceOfBegin);
        findSpiderManFour.setTypeface(typefaceOfBegin);
        findIronManOne.setTypeface(typefaceOfBegin);
        findIronManTwo.setTypeface(typefaceOfBegin);
        findIronManThree.setTypeface(typefaceOfBegin);
        findIronManFour.setTypeface(typefaceOfBegin);
        findEditTextOfQuestionEight.setTypeface(typefaceOfBegin);
        findCorrectAnswerEight.setTypeface(typefaceOfBegin);
        findSubmitButton.setTypeface(typefaceOfBegin);
        findBackToQuizButton.setTypeface(typefaceOfBegin);
        findRestartButton.setTypeface(typefaceOfBegin);

        //Sets Comics Sans font to questions of the Quiz
        TextView questionText = (TextView) findViewById(R.id.question_text);
        TextView findEndScreenText = (TextView) findViewById(R.id.endScreenText);
        Typeface comicsSans = Typeface.createFromAsset(getAssets(), "fonts/comicsans.ttf");
        questionText.setTypeface(comicsSans);
        findEndScreenText.setTypeface(comicsSans);
    }

    // Hides Cover and begins the quiz
    public void hideCover(View view) {
        RelativeLayout cover = (RelativeLayout) findViewById(R.id.cover);
        cover.setVisibility(View.GONE);
        LinearLayout quizHolder = (LinearLayout) findViewById(R.id.quiz_holder);
        quizHolder.setVisibility(View.VISIBLE);
        showQuestion();
    }

    // Hides the current question and shows NEXT
    public void showNext(View view) {
        if (currentQuestion == 8) {
            hideQuestion();
            RelativeLayout showEndScreen = (RelativeLayout) findViewById(R.id.endScreen);
            showEndScreen.setVisibility(View.VISIBLE);
        }
        if (currentQuestion < 8) {
            hideQuestion();
            currentQuestion += 1;
            changeQuestion();
            showQuestion();
        }
    }

    // Hides the current question and shows PREVIOUS
    public void showBack(View view) {
        if (currentQuestion > 1) {
            hideQuestion();
            currentQuestion -= 1;
            changeQuestion();
            showQuestion();
        }

    }

    //Changes string of the question depending on the number of the question
    public void changeQuestion() {
        String questionToShow = "question" + currentQuestion;
        int idOfQuestion = getResources().getIdentifier(questionToShow, "string", getPackageName());
        TextView questionText = (TextView) findViewById(R.id.question_text);
        questionText.setText(idOfQuestion);
    }

    // Shows next or previous question
    public void showQuestion() {
        String questionToShow = "question" + currentQuestion;
        int idOfQuestion = getResources().getIdentifier(questionToShow, "id", getPackageName());
        LinearLayout layoutToShow = (LinearLayout) findViewById(idOfQuestion);
        layoutToShow.setVisibility(View.VISIBLE);
    }

    // Hides current question
    public void hideQuestion() {
        String questionToHide = "question" + currentQuestion;
        int idOfQuestion = getResources().getIdentifier(questionToHide, "id", getPackageName());
        LinearLayout layoutToHide = (LinearLayout) findViewById(idOfQuestion);
        layoutToHide.setVisibility(View.GONE);
    }

    //Returns to Quiz on end screen
    public void backToQuiz(View view) {
        RelativeLayout showEndScreen = (RelativeLayout) findViewById(R.id.endScreen);
        showEndScreen.setVisibility(View.GONE);
        showQuestion();
    }

    //Submits the answers on Submit Button click, then hides submit button, hides last screen TextView, displays scores, displays "Restart Quiz", change string of "Back to Quiz"
    public void submitAnswers(View view) {
        Button submitButton = (Button) findViewById(R.id.submitButton);
        submitButton.setVisibility(View.GONE);
        LinearLayout endScreenText = (LinearLayout) findViewById(R.id.endScreenTextHolder);
        endScreenText.setVisibility(View.GONE);
        checkAnswers();
        Button restartQuiz = (Button) findViewById(R.id.restartQuiz);
        restartQuiz.setVisibility(View.VISIBLE);
        Button backToQuiz = (Button) findViewById(R.id.backToQuiz);
        backToQuiz.setText(getString(R.string.reviewAnswers));
    }

    //Check answers and displays the correct answer on screen of each question
    public void checkAnswers() {
        //Takes the input from question 1 converts it to string
        EditText findNameField = (EditText) findViewById(R.id.name_filed_question_1);
        String answerOfQuestionOne = (findNameField.getText()).toString();

        //Checks the answer of question 1 if it is equal to "Logan", changes color of correct answer to red or green depending on input
        TextView correctAnswerOne = (TextView) findViewById(R.id.correct_answer_1);
        if (answerOfQuestionOne.equals("Logan")) {
            scores += 1;
            correctAnswerOne.setTextColor(Color.parseColor("#00b33c"));
        } else {
            correctAnswerOne.setTextColor(Color.parseColor("#ff0000"));
        }

        //Displays correct answer for question 1
        correctAnswerOne.setText(R.string.correct_answer_1);

        //Checks answer of question 2
        boolean isJoker = ((RadioButton) findViewById(R.id.jokerradio_3)).isChecked();
        if (isJoker) {
            scores += 1;
        }

        //Checks answer of question 3
        boolean isJusticeLeagueBatman = ((CheckBox) findViewById(R.id.justiceLeague_2)).isChecked();
        if (isJusticeLeagueBatman) {
            scores += 1;
        }
        boolean isJusticeLeagueGreenLantern = ((CheckBox) findViewById(R.id.justiceLeague_3)).isChecked();
        if (isJusticeLeagueGreenLantern) {
            scores += 1;
        }

        //Checks answer of question 4
        boolean isStorm = ((RadioButton) findViewById(R.id.stormradio_4)).isChecked();
        if (isStorm) {
            scores += 1;
        }
        ;


        //Takes the input from question 5 converts it to string
        EditText findNameFieldSuperman = (EditText) findViewById(R.id.name_filed_question_5);
        String answerOfQuestionFive = (findNameFieldSuperman.getText()).toString();

        //Checks the answer of question 5 if it is equal to "Superman", changes color of correct answer to red or green depending on input
        TextView correctAnswerFive = (TextView) findViewById(R.id.correct_answer_5);
        if (answerOfQuestionFive.equals("Superman")) {
            scores += 1;
            correctAnswerFive.setTextColor(Color.parseColor("#00b33c"));
        } else {
            correctAnswerFive.setTextColor(Color.parseColor("#ff0000"));
        }

        //Displays correct answer for question 5
        correctAnswerFive.setText(R.string.correct_answer_5);


        //Checks answer of question 6
        boolean isDrOctopus = ((CheckBox) findViewById(R.id.spidermanBox_1)).isChecked();
        if (isDrOctopus) {
            scores += 1;
        }
        ;
        boolean isVenom = ((CheckBox) findViewById(R.id.spidermanBox_4)).isChecked();
        if (isVenom) {
            scores += 1;
        }
        ;


        //Checks answer of question 7
        boolean isIronman = ((RadioButton) findViewById(R.id.ironmanradio_3)).isChecked();
        if (isIronman) {
            scores += 1;
        }
        ;

        //Takes the input from question 8 converts it to string
        EditText findNameFieldCatwoman = (EditText) findViewById(R.id.name_filed_question_8);
        String answerOfQuestionCatwoman = (findNameFieldCatwoman.getText()).toString();

        //Checks the answer of question 8 if it is equal to "Catwoman", changes color of correct answer to red or green depending on input
        TextView correctAnswerEight = (TextView) findViewById(R.id.correct_answer_8);
        if (answerOfQuestionCatwoman.equals("Catwoman")) {
            scores += 1;
            correctAnswerEight.setTextColor(Color.parseColor("#00b33c"));
        } else {
            correctAnswerEight.setTextColor(Color.parseColor("#ff0000"));
        }

        //Displays correct answer for question 8
        correctAnswerEight.setText(R.string.correct_answer_8);

        //Displays WRONG answers of radio buttons and check boxes by setting them a RED color
        RadioButton jokerRadioOne = (RadioButton) findViewById(R.id.jokerradio_1);
        RadioButton jokerRadioTwo = (RadioButton) findViewById(R.id.jokerradio_2);
        RadioButton jokerRadioFour = (RadioButton) findViewById(R.id.jokerradio_4);
        CheckBox justiceLeagueOne = (CheckBox) findViewById(R.id.justiceLeague_1);
        CheckBox justiceLeagueFour = (CheckBox) findViewById(R.id.justiceLeague_4);
        RadioButton stormRadioOne = (RadioButton) findViewById(R.id.stormradio_1);
        RadioButton stormRadioTwo = (RadioButton) findViewById(R.id.stormradio_2);
        RadioButton stormRadioThree = (RadioButton) findViewById(R.id.stormradio_3);
        CheckBox spiderManTwo = (CheckBox) findViewById(R.id.spidermanBox_2);
        CheckBox spiderManThree = (CheckBox) findViewById(R.id.spidermanBox_3);
        RadioButton ironManRadioOne = (RadioButton) findViewById(R.id.ironmanradio_1);
        RadioButton ironManRadioTwo = (RadioButton) findViewById(R.id.ironmanradio_2);
        RadioButton ironManRadioFour = (RadioButton) findViewById(R.id.ironmanradio_4);
        jokerRadioOne.setTextColor(Color.parseColor("#ff0000"));
        jokerRadioTwo.setTextColor(Color.parseColor("#ff0000"));
        jokerRadioFour.setTextColor(Color.parseColor("#ff0000"));
        justiceLeagueOne.setTextColor(Color.parseColor("#ff0000"));
        justiceLeagueFour.setTextColor(Color.parseColor("#ff0000"));
        stormRadioOne.setTextColor(Color.parseColor("#ff0000"));
        stormRadioTwo.setTextColor(Color.parseColor("#ff0000"));
        stormRadioThree.setTextColor(Color.parseColor("#ff0000"));
        spiderManTwo.setTextColor(Color.parseColor("#ff0000"));
        spiderManThree.setTextColor(Color.parseColor("#ff0000"));
        ironManRadioOne.setTextColor(Color.parseColor("#ff0000"));
        ironManRadioTwo.setTextColor(Color.parseColor("#ff0000"));
        ironManRadioFour.setTextColor(Color.parseColor("#ff0000"));


        ////Displays WRONG answers of radio buttons and check boxes by setting them a Green color
        RadioButton jokerRadioThree = (RadioButton) findViewById(R.id.jokerradio_3);
        CheckBox justiceLeagueTwo = (CheckBox) findViewById(R.id.justiceLeague_2);
        CheckBox justiceLeagueThree = (CheckBox) findViewById(R.id.justiceLeague_3);
        RadioButton stormRadioFour = (RadioButton) findViewById(R.id.stormradio_4);
        CheckBox spiderManOne = (CheckBox) findViewById(R.id.spidermanBox_1);
        CheckBox spiderManFour = (CheckBox) findViewById(R.id.spidermanBox_4);
        RadioButton ironManRadioThree = (RadioButton) findViewById(R.id.ironmanradio_3);
        jokerRadioThree.setTextColor(Color.parseColor("#00b33c"));
        justiceLeagueTwo.setTextColor(Color.parseColor("#00b33c"));
        justiceLeagueThree.setTextColor(Color.parseColor("#00b33c"));
        stormRadioFour.setTextColor(Color.parseColor("#00b33c"));
        spiderManOne.setTextColor(Color.parseColor("#00b33c"));
        spiderManFour.setTextColor(Color.parseColor("#00b33c"));
        ironManRadioThree.setTextColor(Color.parseColor("#00b33c"));

        // Displays a toast showing the result
        String message = getString(R.string.scores);
        message += scores;
        message += getString(R.string.outof);
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    //Resets the quiz
    public void resetQuiz(View view) {
        Intent intent = this.getIntent();
        this.finish();
        startActivity(intent);
    }

}

