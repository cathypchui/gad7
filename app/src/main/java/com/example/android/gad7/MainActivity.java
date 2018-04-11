package com.example.android.gad7;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ScrollView gad7ScrollView, personalWellnessScrollView;
    private TextView question8;
    private RadioGroup answerGroup1, answerGroup2, answerGroup3, answerGroup4, answerGroup5, answerGroup6, answerGroup7, answerGroup8;
    private EditText writeIn;
    private CheckBox emailCheck;
    private CheckBox check1, check2, check3, check4, check5, check6, check7, check8, check9, check10, check11;
    private RadioButton notAtAll1, severalDays1, moreThanHalf1, nearlyEveryDay1;
    private RadioButton notAtAll2, severalDays2, moreThanHalf2, nearlyEveryDay2;
    private RadioButton notAtAll3, severalDays3, moreThanHalf3, nearlyEveryDay3;
    private RadioButton notAtAll4, severalDays4, moreThanHalf4, nearlyEveryDay4;
    private RadioButton notAtAll5, severalDays5, moreThanHalf5, nearlyEveryDay5;
    private RadioButton notAtAll6, severalDays6, moreThanHalf6, nearlyEveryDay6;
    private RadioButton notAtAll7, severalDays7, moreThanHalf7, nearlyEveryDay7;
    private RadioButton notDifficult, somewhatDifficult, veryDifficult, extremelyDifficult;
    int finalScore;
    //declares all the keys used in saveInstance and getInstance
    private static final String WRITE_IN = "writeInKey";
    private static final String QUESTION_8_VISIBILITY = "question8Visibility";
    private static final String EMAIL_CHECK = "emailCheckKey";
    private static final String CHECK1 = "check1Key";
    private static final String CHECK2 = "check2Key";
    private static final String CHECK3 = "check3Key";
    private static final String CHECK4 = "check4Key";
    private static final String CHECK5 = "check5Key";
    private static final String CHECK6 = "check6Key";
    private static final String CHECK7 = "check7Key";
    private static final String CHECK8 = "check8Key";
    private static final String CHECK9 = "check9Key";
    private static final String CHECK10 = "check10Key";
    private static final String CHECK11 = "check11Key";
    private static final String NOT_AT_ALL_1 = "notAtAll1Key";
    private static final String NOT_AT_ALL_2 = "notAtAll2Key";
    private static final String NOT_AT_ALL_3 = "notAtAll3Key";
    private static final String NOT_AT_ALL_4 = "notAtAll4Key";
    private static final String NOT_AT_ALL_5 = "notAtAll5Key";
    private static final String NOT_AT_ALL_6 = "notAtAll6Key";
    private static final String NOT_AT_ALL_7 = "notAtAll7Key";
    private static final String SEVERAL_DAYS_1 = "severalDays1Key";
    private static final String SEVERAL_DAYS_2 = "severalDays2Key";
    private static final String SEVERAL_DAYS_3 = "severalDays3Key";
    private static final String SEVERAL_DAYS_4 = "severalDays4Key";
    private static final String SEVERAL_DAYS_5 = "severalDays5Key";
    private static final String SEVERAL_DAYS_6 = "severalDays6Key";
    private static final String SEVERAL_DAYS_7 = "severalDays7Key";
    private static final String MORE_THAN_HALF_1 = "moreThanHalf1Key";
    private static final String MORE_THAN_HALF_2 = "moreThanHalf2Key";
    private static final String MORE_THAN_HALF_3 = "moreThanHalf3Key";
    private static final String MORE_THAN_HALF_4 = "moreThanHalf4Key";
    private static final String MORE_THAN_HALF_5 = "moreThanHalf5Key";
    private static final String MORE_THAN_HALF_6 = "moreThanHalf6Key";
    private static final String MORE_THAN_HALF_7 = "moreThanHalf7Key";
    private static final String NEARLY_EVERY_DAY_1 = "nearlyEveryDay1Key";
    private static final String NEARLY_EVERY_DAY_2 = "nearlyEveryDay2Key";
    private static final String NEARLY_EVERY_DAY_3 = "nearlyEveryDay3Key";
    private static final String NEARLY_EVERY_DAY_4 = "nearlyEveryDay4Key";
    private static final String NEARLY_EVERY_DAY_5 = "nearlyEveryDay5Key";
    private static final String NEARLY_EVERY_DAY_6 = "nearlyEveryDay6Key";
    private static final String NEARLY_EVERY_DAY_7 = "nearlyEveryDay7Key";
    private static final String NOT_DIFFICULT = "notDifficultKey";
    private static final String SOMEWHAT_DIFFICULT = "somewhatDifficultKey";
    private static final String VERY_DIFFICULT = "veryDifficultKey";
    private static final String EXTREMELY_DIFFICULT = "extremelyDifficultKey";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        finalScore = 0;
        gad7ScrollView = findViewById(R.id.gad7_scrollView);
        personalWellnessScrollView = findViewById(R.id.personal_wellness_scrollView);
        question8 = findViewById(R.id.question_8);
        answerGroup1 = findViewById(R.id.answer_group1);
        answerGroup2 = findViewById(R.id.answer_group2);
        answerGroup3 = findViewById(R.id.answer_group3);
        answerGroup4 = findViewById(R.id.answer_group4);
        answerGroup5 = findViewById(R.id.answer_group5);
        answerGroup6 = findViewById(R.id.answer_group6);
        answerGroup7 = findViewById(R.id.answer_group7);
        answerGroup8 = findViewById(R.id.answer_group8);
        writeIn = findViewById(R.id.write_in);
        emailCheck = findViewById(R.id.email_check);
        check1 = findViewById(R.id.check_1);
        check2 = findViewById(R.id.check_2);
        check3 = findViewById(R.id.check_3);
        check4 = findViewById(R.id.check_4);
        check5 = findViewById(R.id.check_5);
        check6 = findViewById(R.id.check_6);
        check7 = findViewById(R.id.check_7);
        check8 = findViewById(R.id.check_8);
        check9 = findViewById(R.id.check_9);
        check10 = findViewById(R.id.check_10);
        check11 = findViewById(R.id.check_11);
        notAtAll1 = findViewById(R.id.not_at_all1);
        severalDays1 = findViewById(R.id.several_days1);
        moreThanHalf1 = findViewById(R.id.more_than_half1);
        nearlyEveryDay1 = findViewById(R.id.nearly_every_day1);
        notAtAll2 = findViewById(R.id.not_at_all2);
        severalDays2 = findViewById(R.id.several_days2);
        moreThanHalf2 = findViewById(R.id.more_than_half2);
        nearlyEveryDay2 = findViewById(R.id.nearly_every_day2);
        notAtAll3 = findViewById(R.id.not_at_all3);
        severalDays3 = findViewById(R.id.several_days3);
        moreThanHalf3 = findViewById(R.id.more_than_half3);
        nearlyEveryDay3 = findViewById(R.id.nearly_every_day3);
        notAtAll4 = findViewById(R.id.not_at_all4);
        severalDays4 = findViewById(R.id.several_days4);
        moreThanHalf4 = findViewById(R.id.more_than_half4);
        nearlyEveryDay4 = findViewById(R.id.nearly_every_day4);
        notAtAll5 = findViewById(R.id.not_at_all5);
        severalDays5 = findViewById(R.id.several_days5);
        moreThanHalf5 = findViewById(R.id.more_than_half5);
        nearlyEveryDay5 = findViewById(R.id.nearly_every_day5);
        notAtAll6 = findViewById(R.id.not_at_all6);
        severalDays6 = findViewById(R.id.several_days6);
        moreThanHalf6 = findViewById(R.id.more_than_half6);
        nearlyEveryDay6 = findViewById(R.id.nearly_every_day6);
        notAtAll7 = findViewById(R.id.not_at_all7);
        severalDays7 = findViewById(R.id.several_days7);
        moreThanHalf7 = findViewById(R.id.more_than_half7);
        nearlyEveryDay7 = findViewById(R.id.nearly_every_day7);
        notDifficult = findViewById(R.id.not_difficult);
        somewhatDifficult = findViewById(R.id.somewhat_difficult);
        veryDifficult = findViewById(R.id.very_difficult);
        extremelyDifficult = findViewById(R.id.extremely_difficult);
        difficultyQuestionDisappears();
    }

    //this method prevents submission if mandatory questions are not answered, and scores the GAD-7 if all mandatory questions are answered
    public void submitAnswers(View view) {
        if (answerGroup1.getCheckedRadioButtonId() == -1) {
            Toast.makeText(getApplicationContext(), getString(R.string.missedQuestion1), Toast.LENGTH_SHORT).show();
            return;
        }
        if (answerGroup2.getCheckedRadioButtonId() == -1) {
            Toast.makeText(getApplicationContext(), getString(R.string.missedQuestion2), Toast.LENGTH_SHORT).show();
            return;
        }
        if (answerGroup3.getCheckedRadioButtonId() == -1) {
            Toast.makeText(getApplicationContext(), getString(R.string.missedQuestion3), Toast.LENGTH_SHORT).show();
            return;
        }
        if (answerGroup4.getCheckedRadioButtonId() == -1) {
            Toast.makeText(getApplicationContext(), getString(R.string.missedQuestion4), Toast.LENGTH_SHORT).show();
            return;
        }
        if (answerGroup5.getCheckedRadioButtonId() == -1) {
            Toast.makeText(getApplicationContext(), getString(R.string.missedQuestion5), Toast.LENGTH_SHORT).show();
            return;
        }
        if (answerGroup6.getCheckedRadioButtonId() == -1) {
            Toast.makeText(getApplicationContext(), getString(R.string.missedQuestion6), Toast.LENGTH_SHORT).show();
            return;
        }
        if (answerGroup7.getCheckedRadioButtonId() == -1) {
            Toast.makeText(getApplicationContext(), getString(R.string.missedQuestion7), Toast.LENGTH_SHORT).show();
            return;
        }
        if (answerGroup8.getCheckedRadioButtonId() == -1 && !notAtAll1.isChecked() && !notAtAll2.isChecked()
                && !notAtAll3.isChecked() && !notAtAll4.isChecked() && !notAtAll5.isChecked() && !notAtAll6.isChecked() && !notAtAll7.isChecked()) {
            Toast.makeText(getApplicationContext(), getString(R.string.missedQuestion8), Toast.LENGTH_SHORT).show();
            return;
        }
        severalDays();
        moreThanHalf();
        nearlyEvery();
        displayResults(finalScore);
        if (emailCheck.isChecked()) {
            emailSomeone();
        }
        finalScore = 0;
    }

    //this method makes question 8 appear if the GAD-7 indicates user is having problems
    public void question8Appears(View view) {
        difficultyQuestionAppears();
    }

    public void question8Disappears(View view) {
        difficultyQuestionDisappears();
    }

    /*this method resets all radio buttons to unchecked
     * and resets the finalScore to 0
     * and resets the resultsSummary
     * and resets all checkboxes to unchecked
     * and clears out the write-in answer
     * and makes difficulty question disappear
     */

    public void resetMethod(View view) {
        answerGroup1.clearCheck();
        answerGroup2.clearCheck();
        answerGroup3.clearCheck();
        answerGroup4.clearCheck();
        answerGroup5.clearCheck();
        answerGroup6.clearCheck();
        answerGroup7.clearCheck();
        answerGroup8.clearCheck();
        writeIn.setText(null);
        if (emailCheck.isChecked()) {
            emailCheck.setChecked(false);
        }
        if (check1.isChecked()) {
            check1.setChecked(false);
        }
        if (check2.isChecked()) {
            check2.setChecked(false);
        }
        if (check3.isChecked()) {
            check3.setChecked(false);
        }
        if (check4.isChecked()) {
            check4.setChecked(false);
        }
        if (check5.isChecked()) {
            check5.setChecked(false);
        }
        if (check6.isChecked()) {
            check6.setChecked(false);
        }
        if (check7.isChecked()) {
            check7.setChecked(false);
        }
        if (check8.isChecked()) {
            check8.setChecked(false);
        }
        if (check9.isChecked()) {
            check9.setChecked(false);
        }
        if (check10.isChecked()) {
            check10.setChecked(false);
        }
        if (check11.isChecked()) {
            check11.setChecked(false);
        }
        finalScore = 0;
        difficultyQuestionDisappears();
        gad7ScrollView.fullScroll(ScrollView.FOCUS_UP);
        personalWellnessScrollView.fullScroll(ScrollView.FOCUS_UP);
    }

    /**
     * This stores all the answers in case of orientation change.
     */
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        String writeInAnswer = writeIn.getText().toString();
        savedInstanceState.putString(WRITE_IN, writeInAnswer);
        if (question8.getVisibility() == View.VISIBLE && answerGroup8.getVisibility() == View.VISIBLE) {
            savedInstanceState.putBoolean(QUESTION_8_VISIBILITY, true);
        } else {
            savedInstanceState.putBoolean(QUESTION_8_VISIBILITY, false);
        }
        if (emailCheck.isChecked()) {
            savedInstanceState.putBoolean(EMAIL_CHECK, true);
        } else {
            savedInstanceState.putBoolean(EMAIL_CHECK, false);
        }
        if (check1.isChecked()) {
            savedInstanceState.putBoolean(CHECK1, true);
        } else {
            savedInstanceState.putBoolean(CHECK1, false);
        }
        if (check2.isChecked()) {
            savedInstanceState.putBoolean(CHECK2, true);
        } else {
            savedInstanceState.putBoolean(CHECK2, false);
        }
        if (check3.isChecked()) {
            savedInstanceState.putBoolean(CHECK3, true);
        } else {
            savedInstanceState.putBoolean(CHECK3, false);
        }
        if (check4.isChecked()) {
            savedInstanceState.putBoolean(CHECK4, true);
        } else {
            savedInstanceState.putBoolean(CHECK4, false);
        }
        if (check5.isChecked()) {
            savedInstanceState.putBoolean(CHECK5, true);
        } else {
            savedInstanceState.putBoolean(CHECK5, false);
        }
        if (check6.isChecked()) {
            savedInstanceState.putBoolean(CHECK6, true);
        } else {
            savedInstanceState.putBoolean(CHECK6, false);
        }
        if (check7.isChecked()) {
            savedInstanceState.putBoolean(CHECK7, true);
        } else {
            savedInstanceState.putBoolean(CHECK7, false);
        }
        if (check8.isChecked()) {
            savedInstanceState.putBoolean(CHECK8, true);
        } else {
            savedInstanceState.putBoolean(CHECK8, false);
        }
        if (check9.isChecked()) {
            savedInstanceState.putBoolean(CHECK9, true);
        } else {
            savedInstanceState.putBoolean(CHECK9, false);
        }
        if (check10.isChecked()) {
            savedInstanceState.putBoolean(CHECK10, true);
        } else {
            savedInstanceState.putBoolean(CHECK10, false);
        }
        if (check11.isChecked()) {
            savedInstanceState.putBoolean(CHECK11, true);
        } else {
            savedInstanceState.putBoolean(CHECK11, false);
        }
        if (notAtAll1.isChecked()) {
            savedInstanceState.putBoolean(NOT_AT_ALL_1, true);
        } else {
            savedInstanceState.putBoolean(NOT_AT_ALL_1, false);
        }
        if (severalDays1.isChecked()) {
            savedInstanceState.putBoolean(SEVERAL_DAYS_1, true);
        } else {
            savedInstanceState.putBoolean(SEVERAL_DAYS_1, false);
        }
        if (moreThanHalf1.isChecked()) {
            savedInstanceState.putBoolean(MORE_THAN_HALF_1, true);
        } else {
            savedInstanceState.putBoolean(MORE_THAN_HALF_1, false);
        }
        if (nearlyEveryDay1.isChecked()) {
            savedInstanceState.putBoolean(NEARLY_EVERY_DAY_1, true);
        } else {
            savedInstanceState.putBoolean(NEARLY_EVERY_DAY_1, false);
        }
        if (notAtAll2.isChecked()) {
            savedInstanceState.putBoolean(NOT_AT_ALL_2, true);
        } else {
            savedInstanceState.putBoolean(NOT_AT_ALL_2, false);
        }
        if (severalDays2.isChecked()) {
            savedInstanceState.putBoolean(SEVERAL_DAYS_2, true);
        } else {
            savedInstanceState.putBoolean(SEVERAL_DAYS_2, false);
        }
        if (moreThanHalf2.isChecked()) {
            savedInstanceState.putBoolean(MORE_THAN_HALF_2, true);
        } else {
            savedInstanceState.putBoolean(MORE_THAN_HALF_2, false);
        }
        if (nearlyEveryDay2.isChecked()) {
            savedInstanceState.putBoolean(NEARLY_EVERY_DAY_2, true);
        } else {
            savedInstanceState.putBoolean(NEARLY_EVERY_DAY_2, false);
        }
        if (notAtAll3.isChecked()) {
            savedInstanceState.putBoolean(NOT_AT_ALL_3, true);
        } else {
            savedInstanceState.putBoolean(NOT_AT_ALL_3, false);
        }
        if (severalDays3.isChecked()) {
            savedInstanceState.putBoolean(SEVERAL_DAYS_3, true);
        } else {
            savedInstanceState.putBoolean(SEVERAL_DAYS_3, false);
        }
        if (moreThanHalf3.isChecked()) {
            savedInstanceState.putBoolean(MORE_THAN_HALF_3, true);
        } else {
            savedInstanceState.putBoolean(MORE_THAN_HALF_3, false);
        }
        if (nearlyEveryDay3.isChecked()) {
            savedInstanceState.putBoolean(NEARLY_EVERY_DAY_3, true);
        } else {
            savedInstanceState.putBoolean(NEARLY_EVERY_DAY_3, false);
        }
        if (notAtAll4.isChecked()) {
            savedInstanceState.putBoolean(NOT_AT_ALL_4, true);
        } else {
            savedInstanceState.putBoolean(NOT_AT_ALL_4, false);
        }
        if (severalDays4.isChecked()) {
            savedInstanceState.putBoolean(SEVERAL_DAYS_4, true);
        } else {
            savedInstanceState.putBoolean(SEVERAL_DAYS_4, false);
        }
        if (moreThanHalf4.isChecked()) {
            savedInstanceState.putBoolean(MORE_THAN_HALF_4, true);
        } else {
            savedInstanceState.putBoolean(MORE_THAN_HALF_4, false);
        }
        if (nearlyEveryDay4.isChecked()) {
            savedInstanceState.putBoolean(NEARLY_EVERY_DAY_4, true);
        } else {
            savedInstanceState.putBoolean(NEARLY_EVERY_DAY_4, false);
        }
        if (notAtAll5.isChecked()) {
            savedInstanceState.putBoolean(NOT_AT_ALL_5, true);
        } else {
            savedInstanceState.putBoolean(NOT_AT_ALL_5, false);
        }
        if (severalDays5.isChecked()) {
            savedInstanceState.putBoolean(SEVERAL_DAYS_5, true);
        } else {
            savedInstanceState.putBoolean(SEVERAL_DAYS_5, false);
        }
        if (moreThanHalf5.isChecked()) {
            savedInstanceState.putBoolean(MORE_THAN_HALF_5, true);
        } else {
            savedInstanceState.putBoolean(MORE_THAN_HALF_5, false);
        }
        if (nearlyEveryDay5.isChecked()) {
            savedInstanceState.putBoolean(NEARLY_EVERY_DAY_5, true);
        } else {
            savedInstanceState.putBoolean(NEARLY_EVERY_DAY_6, false);
        }
        if (notAtAll6.isChecked()) {
            savedInstanceState.putBoolean(NOT_AT_ALL_6, true);
        } else {
            savedInstanceState.putBoolean(NOT_AT_ALL_6, false);
        }
        if (severalDays6.isChecked()) {
            savedInstanceState.putBoolean(SEVERAL_DAYS_6, true);
        } else {
            savedInstanceState.putBoolean(SEVERAL_DAYS_6, false);
        }
        if (moreThanHalf6.isChecked()) {
            savedInstanceState.putBoolean(MORE_THAN_HALF_6, true);
        } else {
            savedInstanceState.putBoolean(MORE_THAN_HALF_6, false);
        }
        if (nearlyEveryDay6.isChecked()) {
            savedInstanceState.putBoolean(NEARLY_EVERY_DAY_6, true);
        } else {
            savedInstanceState.putBoolean(NEARLY_EVERY_DAY_6, false);
        }
        if (notAtAll7.isChecked()) {
            savedInstanceState.putBoolean(NOT_AT_ALL_7, true);
        } else {
            savedInstanceState.putBoolean(NOT_AT_ALL_7, false);
        }
        if (severalDays7.isChecked()) {
            savedInstanceState.putBoolean(SEVERAL_DAYS_7, true);
        } else {
            savedInstanceState.putBoolean(SEVERAL_DAYS_7, false);
        }
        if (moreThanHalf7.isChecked()) {
            savedInstanceState.putBoolean(MORE_THAN_HALF_7, true);
        } else {
            savedInstanceState.putBoolean(MORE_THAN_HALF_7, false);
        }
        if (nearlyEveryDay7.isChecked()) {
            savedInstanceState.putBoolean(NEARLY_EVERY_DAY_7, true);
        } else {
            savedInstanceState.putBoolean(NEARLY_EVERY_DAY_7, false);
        }
        if (notDifficult.isChecked()) {
            savedInstanceState.putBoolean(NOT_DIFFICULT, true);
        } else {
            savedInstanceState.putBoolean(NOT_DIFFICULT, false);
        }
        if (somewhatDifficult.isChecked()) {
            savedInstanceState.putBoolean(SOMEWHAT_DIFFICULT, true);
        } else {
            savedInstanceState.putBoolean(SOMEWHAT_DIFFICULT, false);
        }
        if (veryDifficult.isChecked()) {
            savedInstanceState.putBoolean(VERY_DIFFICULT, true);
        } else {
            savedInstanceState.putBoolean(VERY_DIFFICULT, false);
        }
        if (extremelyDifficult.isChecked()) {
            savedInstanceState.putBoolean(EXTREMELY_DIFFICULT, true);
        } else {
            savedInstanceState.putBoolean(EXTREMELY_DIFFICULT, false);
        }
        super.onSaveInstanceState(savedInstanceState);
    }

    /**
     * This restores all the answers in case of orientation change.
     */
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        String writeInAnswer = savedInstanceState.getString(WRITE_IN);
        writeIn.setText(writeInAnswer);
        boolean question8VisibilityBoolean = savedInstanceState.getBoolean(QUESTION_8_VISIBILITY);
        if (question8VisibilityBoolean) {
            difficultyQuestionAppears();
        }
        boolean emailCheckBoolean = savedInstanceState.getBoolean(EMAIL_CHECK);
        if (emailCheckBoolean) {
            emailCheck.setChecked(true);
        }
        boolean check1Boolean = savedInstanceState.getBoolean(CHECK1);
        if (check1Boolean) {
            check1.setChecked(true);
        }
        boolean check2Boolean = savedInstanceState.getBoolean(CHECK2);
        if (check2Boolean) {
            check2.setChecked(true);
        }
        boolean check3Boolean = savedInstanceState.getBoolean(CHECK3);
        if (check3Boolean) {
            check3.setChecked(true);
        }
        boolean check4Boolean = savedInstanceState.getBoolean(CHECK4);
        if (check4Boolean) {
            check4.setChecked(true);
        }
        boolean check5Boolean = savedInstanceState.getBoolean(CHECK5);
        if (check5Boolean) {
            check5.setChecked(true);
        }
        boolean check6Boolean = savedInstanceState.getBoolean(CHECK6);
        if (check6Boolean) {
            check6.setChecked(true);
        }
        boolean check7Boolean = savedInstanceState.getBoolean(CHECK7);
        if (check7Boolean) {
            check7.setChecked(true);
        }
        boolean check8Boolean = savedInstanceState.getBoolean(CHECK8);
        if (check8Boolean) {
            check8.setChecked(true);
        }
        boolean check9Boolean = savedInstanceState.getBoolean(CHECK9);
        if (check9Boolean) {
            check9.setChecked(true);
        }
        boolean check10Boolean = savedInstanceState.getBoolean(CHECK10);
        if (check10Boolean) {
            check10.setChecked(true);
        }
        boolean check11Boolean = savedInstanceState.getBoolean(CHECK11);
        if (check11Boolean) {
            check11.setChecked(true);
        }
        boolean notAtAll1Boolean = savedInstanceState.getBoolean(NOT_AT_ALL_1);
        if (notAtAll1Boolean) {
            notAtAll1.setChecked(true);
        }
        boolean severalDays1Boolean = savedInstanceState.getBoolean(SEVERAL_DAYS_1);
        if (severalDays1Boolean) {
            severalDays1.setChecked(true);
        }
        boolean moreThanHalf1Boolean = savedInstanceState.getBoolean(MORE_THAN_HALF_1);
        if (moreThanHalf1Boolean) {
            moreThanHalf1.setChecked(true);
        }
        boolean nearlyEveryDay1Boolean = savedInstanceState.getBoolean(NEARLY_EVERY_DAY_1);
        if (nearlyEveryDay1Boolean) {
            nearlyEveryDay1.setChecked(true);
        }
        boolean notAtAll2Boolean = savedInstanceState.getBoolean(NOT_AT_ALL_2);
        if (notAtAll2Boolean) {
            notAtAll2.setChecked(true);
        }
        boolean severalDays2Boolean = savedInstanceState.getBoolean(SEVERAL_DAYS_2);
        if (severalDays2Boolean) {
            severalDays2.setChecked(true);
        }
        boolean moreThanHalf2Boolean = savedInstanceState.getBoolean(MORE_THAN_HALF_2);
        if (moreThanHalf2Boolean) {
            moreThanHalf2.setChecked(true);
        }
        boolean nearlyEveryDay2Boolean = savedInstanceState.getBoolean(NEARLY_EVERY_DAY_2);
        if (nearlyEveryDay2Boolean) {
            nearlyEveryDay2.setChecked(true);
        }
        boolean notAtAll3Boolean = savedInstanceState.getBoolean(NOT_AT_ALL_3);
        if (notAtAll3Boolean) {
            notAtAll3.setChecked(true);
        }
        boolean severalDays3Boolean = savedInstanceState.getBoolean(SEVERAL_DAYS_3);
        if (severalDays3Boolean) {
            severalDays3.setChecked(true);
        }
        boolean moreThanHalf3Boolean = savedInstanceState.getBoolean(MORE_THAN_HALF_3);
        if (moreThanHalf3Boolean) {
            moreThanHalf3.setChecked(true);
        }
        boolean nearlyEveryDay3Boolean = savedInstanceState.getBoolean(NEARLY_EVERY_DAY_3);
        if (nearlyEveryDay3Boolean) {
            nearlyEveryDay3.setChecked(true);
        }
        boolean notAtAll4Boolean = savedInstanceState.getBoolean(NOT_AT_ALL_4);
        if (notAtAll4Boolean) {
            notAtAll4.setChecked(true);
        }
        boolean severalDays4Boolean = savedInstanceState.getBoolean(SEVERAL_DAYS_4);
        if (severalDays4Boolean) {
            severalDays4.setChecked(true);
        }
        boolean moreThanHalf4Boolean = savedInstanceState.getBoolean(MORE_THAN_HALF_4);
        if (moreThanHalf4Boolean) {
            moreThanHalf4.setChecked(true);
        }
        boolean nearlyEveryDay4Boolean = savedInstanceState.getBoolean(NEARLY_EVERY_DAY_4);
        if (nearlyEveryDay4Boolean) {
            nearlyEveryDay4.setChecked(true);
        }
        boolean notAtAll5Boolean = savedInstanceState.getBoolean(NOT_AT_ALL_5);
        if (notAtAll5Boolean) {
            notAtAll5.setChecked(true);
        }
        boolean severalDays5Boolean = savedInstanceState.getBoolean(SEVERAL_DAYS_5);
        if (severalDays5Boolean) {
            severalDays5.setChecked(true);
        }
        boolean moreThanHalf5Boolean = savedInstanceState.getBoolean(MORE_THAN_HALF_5);
        if (moreThanHalf5Boolean) {
            moreThanHalf5.setChecked(true);
        }
        boolean nearlyEveryDay5Boolean = savedInstanceState.getBoolean(NEARLY_EVERY_DAY_5);
        if (nearlyEveryDay5Boolean) {
            nearlyEveryDay5.setChecked(true);
        }
        boolean notAtAll6Boolean = savedInstanceState.getBoolean(NOT_AT_ALL_6);
        if (notAtAll6Boolean) {
            notAtAll6.setChecked(true);
        }
        boolean severalDays6Boolean = savedInstanceState.getBoolean(SEVERAL_DAYS_6);
        if (severalDays6Boolean) {
            severalDays6.setChecked(true);
        }
        boolean moreThanHalf6Boolean = savedInstanceState.getBoolean(MORE_THAN_HALF_6);
        if (moreThanHalf6Boolean) {
            moreThanHalf6.setChecked(true);
        }
        boolean nearlyEveryDay6Boolean = savedInstanceState.getBoolean(NEARLY_EVERY_DAY_6);
        if (nearlyEveryDay6Boolean) {
            nearlyEveryDay6.setChecked(true);
        }
        boolean notAtAll7Boolean = savedInstanceState.getBoolean(NOT_AT_ALL_7);
        if (notAtAll7Boolean) {
            notAtAll7.setChecked(true);
        }
        boolean severalDays7Boolean = savedInstanceState.getBoolean(SEVERAL_DAYS_7);
        if (severalDays7Boolean) {
            severalDays7.setChecked(true);
        }
        boolean moreThanHalf7Boolean = savedInstanceState.getBoolean(MORE_THAN_HALF_7);
        if (moreThanHalf7Boolean) {
            moreThanHalf7.setChecked(true);
        }
        boolean nearlyEveryDay7Boolean = savedInstanceState.getBoolean(NEARLY_EVERY_DAY_7);
        if (nearlyEveryDay7Boolean) {
            nearlyEveryDay7.setChecked(true);
        }
        boolean notDifficultBoolean = savedInstanceState.getBoolean(NOT_DIFFICULT);
        if (notDifficultBoolean) {
            notDifficult.setChecked(true);
        }
        boolean somewhatDifficultBoolean = savedInstanceState.getBoolean(SOMEWHAT_DIFFICULT);
        if (somewhatDifficultBoolean) {
            somewhatDifficult.setChecked(true);
        }
        boolean veryDifficultBoolean = savedInstanceState.getBoolean(VERY_DIFFICULT);
        if (veryDifficultBoolean) {
            veryDifficult.setChecked(true);
        }
        boolean extremelyDifficultBoolean = savedInstanceState.getBoolean(EXTREMELY_DIFFICULT);
        if (extremelyDifficultBoolean) {
            extremelyDifficult.setChecked(true);
        }

    }

    private void emailSomeone() {
        String resultsStatement = getString(R.string.finalScoreSemicolonString) + finalScore;
        if (finalScore < 5) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.belowThresholdString);
        } else if (finalScore > 4 && finalScore < 10) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.mildAnxietyString);
        } else if (finalScore > 9 && finalScore < 15) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.moderateAnxietyString);
        } else if (finalScore > 14 && finalScore < 22) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.severeAnxietyString);
        }
        //this code writes the part of the email that contains the GAD-7 questionnaire
        resultsStatement = resultsStatement + "\n" + getString(R.string.overLastTwoWeeksString);
        //adds results for question 1
        resultsStatement = resultsStatement + "\n" + getString(R.string.question1String);
        if (notAtAll1.isChecked()) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.notAtAllString);
        }
        if (severalDays1.isChecked()) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.severalDaysString);
        }
        if (moreThanHalf1.isChecked()) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.moreThanHalfString);
        }
        if (nearlyEveryDay1.isChecked()) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.nearlyEveryDayString);
        }
        //adds results for question 2
        resultsStatement = resultsStatement + "\n" + getString(R.string.question2String);
        if (notAtAll2.isChecked()) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.notAtAllString);
        }
        if (severalDays2.isChecked()) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.severalDaysString);
        }
        if (moreThanHalf2.isChecked()) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.moreThanHalfString);
        }
        if (nearlyEveryDay2.isChecked()) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.nearlyEveryDayString);
        }
        //adds results for question 3
        resultsStatement = resultsStatement + "\n" + getString(R.string.question3String);
        if (notAtAll3.isChecked()) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.notAtAllString);
        }
        if (severalDays3.isChecked()) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.severalDaysString);
        }
        if (moreThanHalf3.isChecked()) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.moreThanHalfString);
        }
        if (nearlyEveryDay3.isChecked()) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.nearlyEveryDayString);
        }
        //adds results for question 4
        resultsStatement = resultsStatement + "\n" + getString(R.string.question4String);
        if (notAtAll4.isChecked()) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.notAtAllString);
        }
        if (severalDays4.isChecked()) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.severalDaysString);
        }
        if (moreThanHalf4.isChecked()) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.moreThanHalfString);
        }
        if (nearlyEveryDay4.isChecked()) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.nearlyEveryDayString);
        }
        //adds results for question 5
        resultsStatement = resultsStatement + "\n" + getString(R.string.question5String);
        if (notAtAll5.isChecked()) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.notAtAllString);
        }
        if (severalDays5.isChecked()) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.severalDaysString);
        }
        if (moreThanHalf5.isChecked()) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.moreThanHalfString);
        }
        if (nearlyEveryDay5.isChecked()) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.nearlyEveryDayString);
        }
        //adds results for question 6
        resultsStatement = resultsStatement + "\n" + getString(R.string.question6String);
        if (notAtAll6.isChecked()) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.notAtAllString);
        }
        if (severalDays6.isChecked()) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.severalDaysString);
        }
        if (moreThanHalf6.isChecked()) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.moreThanHalfString);
        }
        if (nearlyEveryDay6.isChecked()) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.nearlyEveryDayString);
        }
        //adds results for question 7
        resultsStatement = resultsStatement + "\n" + getString(R.string.question7String);
        if (notAtAll7.isChecked()) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.notAtAllString);
        }
        if (severalDays7.isChecked()) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.severalDaysString);
        }
        if (moreThanHalf7.isChecked()) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.moreThanHalfString);
        }
        if (nearlyEveryDay7.isChecked()) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.nearlyEveryDayString);
        }
        //adds results for question 8 if user answered the question
        if (notDifficult.isChecked() || somewhatDifficult.isChecked() || veryDifficult.isChecked() || extremelyDifficult.isChecked()) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.question8String);
            if (notDifficult.isChecked()) {
                resultsStatement = resultsStatement + "\n" + getString(R.string.notDifficultString);
            }
            if (somewhatDifficult.isChecked()) {
                resultsStatement = resultsStatement + "\n" + getString(R.string.somewhatDifficultString);
            }
            if (veryDifficult.isChecked()) {
                resultsStatement = resultsStatement + "\n" + getString(R.string.veryDifficultString);
            }
            if (extremelyDifficult.isChecked()) {
                resultsStatement = resultsStatement + "\n" + getString(R.string.extremelyDifficultString);
            }
        }
        //adds checked Personal Wellness answers headline
        resultsStatement = resultsStatement + "\n" + getString(R.string.personalWellnessCheckedString);
        //adds checked response 1 if checked
        if (check1.isChecked()) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.check1String);
        }
        //adds checked response 2 if checked
        if (check2.isChecked()) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.check2String);
        }
        //adds checked response 3 if checked
        if (check3.isChecked()) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.check3String);
        }
        //adds checked response 4 if checked
        if (check4.isChecked()) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.check4String);
        }
        //adds checked response 5 if checked
        if (check5.isChecked()) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.check5String);
        }
        //adds checked response 6 if checked
        if (check6.isChecked()) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.check6String);
        }
        //adds checked response 7 if checked
        if (check7.isChecked()) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.check7String);
        }
        //adds checked response 8 if checked
        if (check8.isChecked()) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.check8String);
        }
        //adds checked response 9 if checked
        if (check9.isChecked()) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.check9String);
        }
        //adds checked response 10 if checked
        if (check10.isChecked()) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.check10String);
        }
        //adds checked response 11 if checked
        if (check11.isChecked()) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.check11String);
        }
        //indicates Personal Wellness unchecked answers
        resultsStatement = resultsStatement + "\n" + getString(R.string.personalWellnessUncheckedString);
        //adds checked response 1 if unchecked
        if (!check1.isChecked()) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.check1String);
        }
        //adds checked response 2 if unchecked
        if (!check2.isChecked()) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.check2String);
        }
        //adds checked response 3 if unchecked
        if (!check3.isChecked()) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.check3String);
        }
        //adds checked response 4 if unchecked
        if (!check4.isChecked()) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.check4String);
        }
        //adds checked response 5 if unchecked
        if (!check5.isChecked()) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.check5String);
        }
        //adds checked response 6 if unchecked
        if (!check6.isChecked()) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.check6String);
        }
        //adds checked response 7 if unchecked
        if (!check7.isChecked()) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.check7String);
        }
        //adds checked response 8 if unchecked
        if (!check8.isChecked()) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.check8String);
        }
        //adds checked response 9 if unchecked
        if (!check9.isChecked()) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.check9String);
        }
        //adds checked response 10 if unchecked
        if (!check10.isChecked()) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.check10String);
        }
        //adds checked response 11 if unchecked
        if (!check11.isChecked()) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.check11String);
        }
        //adds question with write-in answer
        resultsStatement = resultsStatement + "\n" + getString(R.string.lastQuestionHintString);
        //adds write-in answer
        String writeInAnswer = writeIn.getText().toString();
        resultsStatement = resultsStatement + "\n" + writeInAnswer;
        //sends email to email address of choice
        Intent emailSummary = new Intent(Intent.ACTION_SENDTO);
        emailSummary.setData(Uri.parse("mailto:"));
        emailSummary.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.app_name));
        emailSummary.putExtra(Intent.EXTRA_TEXT, resultsStatement);
        try {
            startActivity(Intent.createChooser(emailSummary, getString(R.string.sendMailString)));
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(this, getString(R.string.noEmailClientsAvailable), Toast.LENGTH_SHORT).show();
        }
    }

    //String TAG = "testing";
    /*
    This method calculates the number of answers in the "Several Days" category
     */
    private void severalDays() {
        if (severalDays1.isChecked()) {
            finalScore = finalScore + 1;
        }
        if (severalDays2.isChecked()) {
            finalScore = finalScore + 1;
        }
        if (severalDays3.isChecked()) {
            finalScore = finalScore + 1;
        }
        if (severalDays4.isChecked()) {
            finalScore = finalScore + 1;
        }
        if (severalDays5.isChecked()) {
            finalScore = finalScore + 1;
        }
        if (severalDays6.isChecked()) {
            finalScore = finalScore + 1;
        }
        if (severalDays7.isChecked()) {
            finalScore = finalScore + 1;
        }
    }

    /*
    This method calculates the number of answers in the "More than half the days" category
     */
    private void moreThanHalf() {
        if (moreThanHalf1.isChecked()) {
            finalScore = finalScore + 2;
        }
        if (moreThanHalf2.isChecked()) {
            finalScore = finalScore + 2;
        }
        if (moreThanHalf3.isChecked()) {
            finalScore = finalScore + 2;
        }
        if (moreThanHalf4.isChecked()) {
            finalScore = finalScore + 2;
        }
        if (moreThanHalf5.isChecked()) {
            finalScore = finalScore + 2;
        }
        if (moreThanHalf6.isChecked()) {
            finalScore = finalScore + 2;
        }
        if (moreThanHalf7.isChecked()) {
            finalScore = finalScore + 2;
        }
    }

    /*
    This method calculates the number of answers in the "Nearly every day" category
     */
    private void nearlyEvery() {
        if (nearlyEveryDay1.isChecked()) {
            finalScore = finalScore + 3;
        }
        if (nearlyEveryDay2.isChecked()) {
            finalScore = finalScore + 3;
        }
        if (nearlyEveryDay3.isChecked()) {
            finalScore = finalScore + 3;
        }
        if (nearlyEveryDay4.isChecked()) {
            finalScore = finalScore + 3;
        }
        if (nearlyEveryDay5.isChecked()) {
            finalScore = finalScore + 3;
        }
        if (nearlyEveryDay6.isChecked()) {
            finalScore = finalScore + 3;
        }
        if (nearlyEveryDay7.isChecked()) {
            finalScore = finalScore + 3;
        }
    }

    /*
    This method makes Question 8 of the GAD-7 disappear
     */
    private void difficultyQuestionDisappears() {
        if (question8.getVisibility() == View.VISIBLE && answerGroup8.getVisibility() == View.VISIBLE) {
            if (notAtAll1.isChecked() && notAtAll2.isChecked() && notAtAll3.isChecked() && notAtAll4.isChecked() && notAtAll5.isChecked()
                    && notAtAll6.isChecked() && notAtAll7.isChecked()) {
                question8.setVisibility(View.GONE);
                answerGroup8.setVisibility(View.GONE);
            }
        }
    }

    /*
    This method makes Question 8 of the GAD-7 appear
     */
    private void difficultyQuestionAppears() {
        if (question8.getVisibility() == View.GONE && answerGroup8.getVisibility() == View.GONE) {
            question8.setVisibility(View.VISIBLE);
            answerGroup8.setVisibility(View.VISIBLE);
        }
    }

    /*
    This method creates the Results Summary, which includes the final score and what it indicates about the anxiety level of the user
     */
    private void displayResults(int finalScore) {
        String resultsStatement = getString(R.string.finalScoreSemicolonString) + finalScore;
        if (finalScore < 5) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.belowThresholdString);
        } else if (finalScore > 4 && finalScore < 10) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.mildAnxietyString);
        } else if (finalScore > 10 && finalScore < 15) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.moderateAnxietyString);
        } else if (finalScore > 14 && finalScore < 22) {
            resultsStatement = resultsStatement + "\n" + getString(R.string.severeAnxietyString);
        }
        Toast.makeText(getApplicationContext(), resultsStatement, Toast.LENGTH_LONG).show();
    }

}
