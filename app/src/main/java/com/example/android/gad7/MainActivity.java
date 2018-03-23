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
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ScrollView gad7ScrollView;
    ScrollView personalWellnessScrollView;
    RadioGroup answerGroup1;
    RadioGroup answerGroup2;
    RadioGroup answerGroup3;
    RadioGroup answerGroup4;
    RadioGroup answerGroup5;
    RadioGroup answerGroup6;
    RadioGroup answerGroup7;
    RadioGroup answerGroup8;
    EditText writeIn;
    CheckBox emailCheck;
    CheckBox check1;
    CheckBox check2;
    CheckBox check3;
    CheckBox check4;
    CheckBox check5;
    CheckBox check6;
    CheckBox check7;
    CheckBox check8;
    CheckBox check9;
    CheckBox check10;
    CheckBox check11;
    RadioButton notAtAll1;
    RadioButton severalDays1;
    RadioButton moreThanHalf1;
    RadioButton nearlyEveryDay1;
    RadioButton notAtAll2;
    RadioButton severalDays2;
    RadioButton moreThanHalf2;
    RadioButton nearlyEveryDay2;
    RadioButton notAtAll3;
    RadioButton severalDays3;
    RadioButton moreThanHalf3;
    RadioButton nearlyEveryDay3;
    RadioButton notAtAll4;
    RadioButton severalDays4;
    RadioButton moreThanHalf4;
    RadioButton nearlyEveryDay4;
    RadioButton notAtAll5;
    RadioButton severalDays5;
    RadioButton moreThanHalf5;
    RadioButton nearlyEveryDay5;
    RadioButton notAtAll6;
    RadioButton severalDays6;
    RadioButton moreThanHalf6;
    RadioButton nearlyEveryDay6;
    RadioButton notAtAll7;
    RadioButton severalDays7;
    RadioButton moreThanHalf7;
    RadioButton nearlyEveryDay7;
    RadioButton notDifficult;
    RadioButton somewhatDifficult;
    RadioButton veryDifficult;
    RadioButton extremelyDifficult;
    int finalScore;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        finalScore = 0;
        gad7ScrollView = findViewById(R.id.gad7_scrollView);
        personalWellnessScrollView = findViewById(R.id.personal_wellness_scrollView);
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
    }

    //this method calculates the final score upon submission of all answers
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
        if (answerGroup8.getCheckedRadioButtonId() == -1) {
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
    /*this method resets all radio buttons to unchecked
    *and resets the finalScore to 0
    * and resets the resultsSummary
    * and resets all checkboxes to unchecked
    * and clears out the write-in answer
    */

    public void resetMethod(View view) {
        gad7ScrollView.fullScroll(ScrollView.FOCUS_UP);
        personalWellnessScrollView.fullScroll(ScrollView.FOCUS_UP);
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
    }

    /**
     * This stores all the answers in case of orientation change.
     */
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        String writeInAnswer = writeIn.getText().toString();
        savedInstanceState.putString("writeInKey", writeInAnswer);
        if (emailCheck.isChecked()) {
            savedInstanceState.putBoolean("emailCheckKey", true);
        } else {
            savedInstanceState.putBoolean("emailCheckKey", false);
        }
        if (check1.isChecked()) {
            savedInstanceState.putBoolean("check1Key", true);
        } else {
            savedInstanceState.putBoolean("check1Key", false);
        }
        if (check2.isChecked()) {
            savedInstanceState.putBoolean("check2Key", true);
        } else {
            savedInstanceState.putBoolean("check2Key", false);
        }
        if (check3.isChecked()) {
            savedInstanceState.putBoolean("check3Key", true);
        } else {
            savedInstanceState.putBoolean("check3Key", false);
        }
        if (check4.isChecked()) {
            savedInstanceState.putBoolean("check4Key", true);
        } else {
            savedInstanceState.putBoolean("check4Key", false);
        }
        if (check5.isChecked()) {
            savedInstanceState.putBoolean("check5Key", true);
        } else {
            savedInstanceState.putBoolean("check5Key", false);
        }
        if (check6.isChecked()) {
            savedInstanceState.putBoolean("check6Key", true);
        } else {
            savedInstanceState.putBoolean("check6Key", false);
        }
        if (check7.isChecked()) {
            savedInstanceState.putBoolean("check7Key", true);
        } else {
            savedInstanceState.putBoolean("check7Key", false);
        }
        if (check8.isChecked()) {
            savedInstanceState.putBoolean("check8Key", true);
        } else {
            savedInstanceState.putBoolean("check8Key", false);
        }
        if (check9.isChecked()) {
            savedInstanceState.putBoolean("check9Key", true);
        } else {
            savedInstanceState.putBoolean("check9Key", false);
        }
        if (check10.isChecked()) {
            savedInstanceState.putBoolean("check10Key", true);
        } else {
            savedInstanceState.putBoolean("check10Key", false);
        }
        if (check11.isChecked()) {
            savedInstanceState.putBoolean("check11Key", true);
        } else {
            savedInstanceState.putBoolean("check11Key", false);
        }
        if (notAtAll1.isChecked()) {
            savedInstanceState.putBoolean("notAtAll1Key", true);
        } else {
            savedInstanceState.putBoolean("notAtAll1Key", false);
        }
        if (severalDays1.isChecked()) {
            savedInstanceState.putBoolean("severalDays1Key", true);
        } else {
            savedInstanceState.putBoolean("severalDays1Key", false);
        }
        if (moreThanHalf1.isChecked()) {
            savedInstanceState.putBoolean("moreThanHalf1Key", true);
        } else {
            savedInstanceState.putBoolean("moreThanHalf1Key", false);
        }
        if (nearlyEveryDay1.isChecked()) {
            savedInstanceState.putBoolean("nearlyEveryDay1Key", true);
        } else {
            savedInstanceState.putBoolean("nearlyEveryDay1Key", false);
        }
        if (notAtAll2.isChecked()) {
            savedInstanceState.putBoolean("notAtAll2Key", true);
        } else {
            savedInstanceState.putBoolean("notAtAll2Key", false);
        }
        if (severalDays2.isChecked()) {
            savedInstanceState.putBoolean("severalDays2Key", true);
        } else {
            savedInstanceState.putBoolean("severalDays2Key", false);
        }
        if (moreThanHalf2.isChecked()) {
            savedInstanceState.putBoolean("moreThanHalf2Key", true);
        } else {
            savedInstanceState.putBoolean("moreThanHalf2Key", false);
        }
        if (nearlyEveryDay2.isChecked()) {
            savedInstanceState.putBoolean("nearlyEveryDay2Key", true);
        } else {
            savedInstanceState.putBoolean("nearlyEveryDay2Key", false);
        }
        if (notAtAll3.isChecked()) {
            savedInstanceState.putBoolean("notAtAll3Key", true);
        } else {
            savedInstanceState.putBoolean("notAtAll3Key", false);
        }
        if (severalDays3.isChecked()) {
            savedInstanceState.putBoolean("severalDays3Key", true);
        } else {
            savedInstanceState.putBoolean("severalDays3Key", false);
        }
        if (moreThanHalf3.isChecked()) {
            savedInstanceState.putBoolean("moreThanHalf3Key", true);
        } else {
            savedInstanceState.putBoolean("moreThanHalf3Key", false);
        }
        if (nearlyEveryDay3.isChecked()) {
            savedInstanceState.putBoolean("nearlyEveryDay3Key", true);
        } else {
            savedInstanceState.putBoolean("nearlyEveryDay3Key", false);
        }
        if (notAtAll4.isChecked()) {
            savedInstanceState.putBoolean("notAtAll4Key", true);
        } else {
            savedInstanceState.putBoolean("notAtAll4Key", false);
        }
        if (severalDays4.isChecked()) {
            savedInstanceState.putBoolean("severalDays4Key", true);
        } else {
            savedInstanceState.putBoolean("severalDays4Key", false);
        }
        if (moreThanHalf4.isChecked()) {
            savedInstanceState.putBoolean("moreThanHalf4Key", true);
        } else {
            savedInstanceState.putBoolean("moreThanHalf4Key", false);
        }
        if (nearlyEveryDay4.isChecked()) {
            savedInstanceState.putBoolean("nearlyEveryDay4Key", true);
        } else {
            savedInstanceState.putBoolean("nearlyEveryDay4Key", false);
        }
        if (notAtAll5.isChecked()) {
            savedInstanceState.putBoolean("notAtAll5Key", true);
        } else {
            savedInstanceState.putBoolean("notAtAll5Key", false);
        }
        if (severalDays5.isChecked()) {
            savedInstanceState.putBoolean("severalDays5Key", true);
        } else {
            savedInstanceState.putBoolean("severalDays5Key", false);
        }
        if (moreThanHalf5.isChecked()) {
            savedInstanceState.putBoolean("moreThanHalf5Key", true);
        } else {
            savedInstanceState.putBoolean("moreThanHalf5Key", false);
        }
        if (nearlyEveryDay5.isChecked()) {
            savedInstanceState.putBoolean("nearlyEveryDay5Key", true);
        } else {
            savedInstanceState.putBoolean("nearlyEveryDay5Key", false);
        }
        if (notAtAll6.isChecked()) {
            savedInstanceState.putBoolean("notAtAll6Key", true);
        } else {
            savedInstanceState.putBoolean("notAtAll6Key", false);
        }
        if (severalDays6.isChecked()) {
            savedInstanceState.putBoolean("severalDays6Key", true);
        } else {
            savedInstanceState.putBoolean("severalDays6Key", false);
        }
        if (moreThanHalf6.isChecked()) {
            savedInstanceState.putBoolean("moreThanHalf6Key", true);
        } else {
            savedInstanceState.putBoolean("moreThanHalf6Key", false);
        }
        if (nearlyEveryDay6.isChecked()) {
            savedInstanceState.putBoolean("nearlyEveryDay6Key", true);
        } else {
            savedInstanceState.putBoolean("nearlyEveryDay6Key", false);
        }
        if (notAtAll7.isChecked()) {
            savedInstanceState.putBoolean("notAtAll7Key", true);
        } else {
            savedInstanceState.putBoolean("notAtAll7Key", false);
        }
        if (severalDays7.isChecked()) {
            savedInstanceState.putBoolean("severalDays7Key", true);
        } else {
            savedInstanceState.putBoolean("severalDays7Key", false);
        }
        if (moreThanHalf7.isChecked()) {
            savedInstanceState.putBoolean("moreThanHalf7Key", true);
        } else {
            savedInstanceState.putBoolean("moreThanHalf7Key", false);
        }
        if (nearlyEveryDay7.isChecked()) {
            savedInstanceState.putBoolean("nearlyEveryDay7Key", true);
        } else {
            savedInstanceState.putBoolean("nearlyEveryDay7Key", false);
        }
        if (notDifficult.isChecked()) {
            savedInstanceState.putBoolean("notDifficultKey", true);
        } else {
            savedInstanceState.putBoolean("notDifficultKey", false);
        }
        if (somewhatDifficult.isChecked()) {
            savedInstanceState.putBoolean("somewhatDifficultKey", true);
        } else {
            savedInstanceState.putBoolean("somewhatDifficultKey", false);
        }
        if (veryDifficult.isChecked()) {
            savedInstanceState.putBoolean("veryDifficultKey", true);
        } else {
            savedInstanceState.putBoolean("veryDifficultKey", false);
        }
        if (extremelyDifficult.isChecked()) {
            savedInstanceState.putBoolean("extremelyDifficultKey", true);
        } else {
            savedInstanceState.putBoolean("extremelyDifficultKey", false);
        }
        super.onSaveInstanceState(savedInstanceState);
    }

    /**
     * This restores all the answers in case of orientation change.
     */
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        String writeInAnswer = savedInstanceState.getString("writeInKey");
        writeIn.setText(writeInAnswer);
        boolean emailCheckBoolean = savedInstanceState.getBoolean("emailCheckKey");
        if (emailCheckBoolean) {
            emailCheck.setChecked(true);
        }
        boolean check1Boolean = savedInstanceState.getBoolean("check1Key");
        if (check1Boolean) {
            check1.setChecked(true);
        }
        boolean check2Boolean = savedInstanceState.getBoolean("check2Key");
        if (check2Boolean) {
            check2.setChecked(true);
        }
        boolean check3Boolean = savedInstanceState.getBoolean("check3Key");
        if (check3Boolean) {
            check3.setChecked(true);
        }
        boolean check4Boolean = savedInstanceState.getBoolean("check4Key");
        if (check4Boolean) {
            check4.setChecked(true);
        }
        boolean check5Boolean = savedInstanceState.getBoolean("check5Key");
        if (check5Boolean) {
            check5.setChecked(true);
        }
        boolean check6Boolean = savedInstanceState.getBoolean("check6Key");
        if (check6Boolean) {
            check6.setChecked(true);
        }
        boolean check7Boolean = savedInstanceState.getBoolean("check7Key");
        if (check7Boolean) {
            check7.setChecked(true);
        }
        boolean check8Boolean = savedInstanceState.getBoolean("check8Key");
        if (check8Boolean) {
            check8.setChecked(true);
        }
        boolean check9Boolean = savedInstanceState.getBoolean("check9Key");
        if (check9Boolean) {
            check9.setChecked(true);
        }
        boolean check10Boolean = savedInstanceState.getBoolean("check10Key");
        if (check10Boolean) {
            check10.setChecked(true);
        }
        boolean check11Boolean = savedInstanceState.getBoolean("check11Key");
        if (check11Boolean) {
            check11.setChecked(true);
        }
        boolean notAtAll1Boolean = savedInstanceState.getBoolean("notAtAll1Key");
        if (notAtAll1Boolean) {
            notAtAll1.setChecked(true);
        }
        boolean severalDays1Boolean = savedInstanceState.getBoolean("severalDays1Key");
        if (severalDays1Boolean) {
            severalDays1.setChecked(true);
        }
        boolean moreThanHalf1Boolean = savedInstanceState.getBoolean("moreThanHalf1Key");
        if (moreThanHalf1Boolean) {
            moreThanHalf1.setChecked(true);
        }
        boolean nearlyEveryDay1Boolean = savedInstanceState.getBoolean("nearlyEveryDay1Key");
        if (nearlyEveryDay1Boolean) {
            nearlyEveryDay1.setChecked(true);
        }
        boolean notAtAll2Boolean = savedInstanceState.getBoolean("notAtAll2Key");
        if (notAtAll2Boolean) {
            notAtAll2.setChecked(true);
        }
        boolean severalDays2Boolean = savedInstanceState.getBoolean("severalDays2Key");
        if (severalDays2Boolean) {
            severalDays2.setChecked(true);
        }
        boolean moreThanHalf2Boolean = savedInstanceState.getBoolean("moreThanHalf2Key");
        if (moreThanHalf2Boolean) {
            moreThanHalf2.setChecked(true);
        }
        boolean nearlyEveryDay2Boolean = savedInstanceState.getBoolean("nearlyEveryDay2Key");
        if (nearlyEveryDay2Boolean) {
            nearlyEveryDay2.setChecked(true);
        }
        boolean notAtAll3Boolean = savedInstanceState.getBoolean("notAtAll3Key");
        if (notAtAll3Boolean) {
            notAtAll3.setChecked(true);
        }
        boolean severalDays3Boolean = savedInstanceState.getBoolean("severalDays3Key");
        if (severalDays3Boolean) {
            severalDays3.setChecked(true);
        }
        boolean moreThanHalf3Boolean = savedInstanceState.getBoolean("moreThanHalf3Key");
        if (moreThanHalf3Boolean) {
            moreThanHalf3.setChecked(true);
        }
        boolean nearlyEveryDay3Boolean = savedInstanceState.getBoolean("nearlyEveryDay3Key");
        if (nearlyEveryDay3Boolean) {
            nearlyEveryDay3.setChecked(true);
        }
        boolean notAtAll4Boolean = savedInstanceState.getBoolean("notAtAll4Key");
        if (notAtAll4Boolean) {
            notAtAll4.setChecked(true);
        }
        boolean severalDays4Boolean = savedInstanceState.getBoolean("severalDays4Key");
        if (severalDays4Boolean) {
            severalDays4.setChecked(true);
        }
        boolean moreThanHalf4Boolean = savedInstanceState.getBoolean("moreThanHalf4Key");
        if (moreThanHalf4Boolean) {
            moreThanHalf4.setChecked(true);
        }
        boolean nearlyEveryDay4Boolean = savedInstanceState.getBoolean("nearlyEveryDay4Key");
        if (nearlyEveryDay4Boolean) {
            nearlyEveryDay4.setChecked(true);
        }
        boolean notAtAll5Boolean = savedInstanceState.getBoolean("notAtAll5Key");
        if (notAtAll5Boolean) {
            notAtAll5.setChecked(true);
        }
        boolean severalDays5Boolean = savedInstanceState.getBoolean("severalDays5Key");
        if (severalDays5Boolean) {
            severalDays5.setChecked(true);
        }
        boolean moreThanHalf5Boolean = savedInstanceState.getBoolean("moreThanHalf5Key");
        if (moreThanHalf5Boolean) {
            moreThanHalf5.setChecked(true);
        }
        boolean nearlyEveryDay5Boolean = savedInstanceState.getBoolean("nearlyEveryDay5Key");
        if (nearlyEveryDay5Boolean) {
            nearlyEveryDay5.setChecked(true);
        }
        boolean notAtAll6Boolean = savedInstanceState.getBoolean("notAtAll6Key");
        if (notAtAll6Boolean) {
            notAtAll6.setChecked(true);
        }
        boolean severalDays6Boolean = savedInstanceState.getBoolean("severalDays6Key");
        if (severalDays6Boolean) {
            severalDays6.setChecked(true);
        }
        boolean moreThanHalf6Boolean = savedInstanceState.getBoolean("moreThanHalf6Key");
        if (moreThanHalf6Boolean) {
            moreThanHalf6.setChecked(true);
        }
        boolean nearlyEveryDay6Boolean = savedInstanceState.getBoolean("nearlyEveryDay6Key");
        if (nearlyEveryDay6Boolean) {
            nearlyEveryDay6.setChecked(true);
        }
        boolean notAtAll7Boolean = savedInstanceState.getBoolean("notAtAll7Key");
        if (notAtAll7Boolean) {
            notAtAll7.setChecked(true);
        }
        boolean severalDays7Boolean = savedInstanceState.getBoolean("severalDays7Key");
        if (severalDays7Boolean) {
            severalDays7.setChecked(true);
        }
        boolean moreThanHalf7Boolean = savedInstanceState.getBoolean("moreThanHalf7Key");
        if (moreThanHalf7Boolean) {
            moreThanHalf7.setChecked(true);
        }
        boolean nearlyEveryDay7Boolean = savedInstanceState.getBoolean("nearlyEveryDay7Key");
        if (nearlyEveryDay7Boolean) {
            nearlyEveryDay7.setChecked(true);
        }
        boolean notDifficultBoolean = savedInstanceState.getBoolean("notDifficultKey");
        if (notDifficultBoolean) {
            notDifficult.setChecked(true);
        }
        boolean somewhatDifficultBoolean = savedInstanceState.getBoolean("somewhatDifficultKey");
        if (somewhatDifficultBoolean) {
            somewhatDifficult.setChecked(true);
        }
        boolean veryDifficultBoolean = savedInstanceState.getBoolean("veryDifficultKey");
        if (veryDifficultBoolean) {
            veryDifficult.setChecked(true);
        }
        boolean extremelyDifficultBoolean = savedInstanceState.getBoolean("extremelyDifficultKey");
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
        //adds results for question 8
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
        //  Log.v(TAG, "here is the" + finalScore);
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
    This method creates the Results Summary, which includes the final score and what it indicates about the anxiety level of the user
     */
    private void displayResults(int finalScore) {
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
        Toast.makeText(getApplicationContext(), resultsStatement, Toast.LENGTH_LONG).show();
    }

}
