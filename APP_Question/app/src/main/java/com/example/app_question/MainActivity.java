package com.example.app_question;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.skydoves.progressview.ProgressView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView tvQuestion;
    private  TextView tvContentQuestion;
    private TextView tvAnswer1 , tvAnswer2 , tvAnswer3 , tvAnswer4;
    private Button btnkhangia;
    private  List<Question> mlistQuestion;
    Question mQuestion;
    private int curenQuestio = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tinh();

        mlistQuestion = getlistQuestion();
        if (mlistQuestion.isEmpty()){
            return;
        }
        setDataQuestion(mlistQuestion.get(curenQuestio));

        btnkhangia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog(70,10,5,15);
            }
        });
    }

    private void openDialog(int progress1 , int progress2 , int progress3 , int progress4) {
        Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.layout_dialog);

        Window window = dialog.getWindow();
        if (window == null){
            return;
        }
        window.setLayout(WindowManager.LayoutParams.MATCH_PARENT,WindowManager.LayoutParams.WRAP_CONTENT);
        window.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setCancelable(false);

        TextView tvProgress_1 = dialog.findViewById(R.id.tv_progress_1);
        TextView tvProgress_2 = dialog.findViewById(R.id.tv_progress_2);
        TextView tvProgress_3 = dialog.findViewById(R.id.tv_progress_3);
        TextView tvProgress_4 = dialog.findViewById(R.id.tv_progress_4);

        ProgressView progressView1 = dialog.findViewById(R.id.progress_1);
        ProgressView progressView2 = dialog.findViewById(R.id.progress_2);
        ProgressView progressView3 = dialog.findViewById(R.id.progress_3);
        ProgressView progressView4 = dialog.findViewById(R.id.progress_4);

        Button btnThanks = dialog.findViewById(R.id.btn_thanks);
        tvProgress_1.setText(progress1 + "%");
        tvProgress_2.setText(progress2 + "%");
        tvProgress_3.setText(progress3 + "%");
        tvProgress_4.setText(progress4 + "%");

        progressView1.setProgress(progress1);
        progressView2.setProgress(progress2);
        progressView3.setProgress(progress3);
        progressView4.setProgress(progress4);

        btnThanks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }

    private void setDataQuestion(Question question) {
        if (question==null){
            return;
        }
        mQuestion = question;
        tvAnswer1.setBackgroundResource(R.drawable.bg_blue_10);
        tvAnswer2.setBackgroundResource(R.drawable.bg_blue_10);
        tvAnswer3.setBackgroundResource(R.drawable.bg_blue_10);
        tvAnswer4.setBackgroundResource(R.drawable.bg_blue_10);


        String titleQuestion = "Question " + question.getSocauhoi();
        tvQuestion.setText(titleQuestion);
        tvContentQuestion.setText(question.getContent());
        tvAnswer1.setText(question.getListAnswer().get(0).getContent());
        tvAnswer2.setText(question.getListAnswer().get(1).getContent());
        tvAnswer3.setText(question.getListAnswer().get(2).getContent());
        tvAnswer4.setText(question.getListAnswer().get(3).getContent());

        tvAnswer1.setOnClickListener(this);
        tvAnswer2.setOnClickListener(this);
        tvAnswer3.setOnClickListener(this);
        tvAnswer4.setOnClickListener(this);

    }

    private void tinh() {
        //Anh xa
        tvQuestion = (TextView) findViewById(R.id.tv_question);
        tvContentQuestion = (TextView) findViewById(R.id.tv_content_question);
        tvAnswer1 = (TextView) findViewById(R.id.tv_answer1);
        tvAnswer2 = (TextView) findViewById(R.id.tv_answer2);
        tvAnswer3 = (TextView) findViewById(R.id.tv_answer3);
        tvAnswer4 = (TextView) findViewById(R.id.tv_answer4);
        btnkhangia = (Button) findViewById(R.id.btnkhangia);
    }

    private List<Question> getlistQuestion(){
        List<Question> list = new ArrayList<>();

        List<Answer> answers1 = new ArrayList<>();
        answers1.add(new Answer("Madonna" , true));
        answers1.add(new Answer("Glasio",false));
        answers1.add(new Answer("KTop",false));
        answers1.add(new Answer("Azbuke",false));

        List<Answer> answers2 = new ArrayList<>();
        answers2.add(new Answer("Lá Gan" , true));
        answers2.add(new Answer("Phổi",false));
        answers2.add(new Answer("Tim",false));
        answers2.add(new Answer("Dạ Dày",false));

        List<Answer> answers3 = new ArrayList<>();
        answers3.add(new Answer("20" , false));
        answers3.add(new Answer("22",false));
        answers3.add(new Answer("21",true));
        answers3.add(new Answer("19",false));

        List<Answer> answers4 = new ArrayList<>();
        answers4.add(new Answer("Sao Hỏa" , false));
        answers4.add(new Answer("Sao Thổ",false));
        answers4.add(new Answer("Sao Kim",false));
        answers4.add(new Answer("Sao Mộc",true));

        List<Answer> answers5 = new ArrayList<>();
        answers5.add(new Answer("Chân không" , true));
        answers5.add(new Answer("Không khí",false));
        answers5.add(new Answer("Nước",false));
        answers5.add(new Answer("Cả 3 đều đúng",false));

        List<Answer> answers6 = new ArrayList<>();
        answers6.add(new Answer("8,9" , false));
        answers6.add(new Answer("13,15",false));
        answers6.add(new Answer("11,13",true));
        answers6.add(new Answer("9,11",false));

        List<Answer> answers7 = new ArrayList<>();
        answers7.add(new Answer("15/3/1945" , false));
        answers7.add(new Answer("12/3/1945",true));
        answers7.add(new Answer("19/3/1945",false));
        answers7.add(new Answer("4/3/1946",false));

        List<Answer> answers8 = new ArrayList<>();
        answers8.add(new Answer("Siêu âm" , true));
        answers8.add(new Answer("Sóng âm",false));
        answers8.add(new Answer("Cao âm",false));
        answers8.add(new Answer("Sóng cơ",false));

        List<Answer> answers9 = new ArrayList<>();
        answers9.add(new Answer("H2" , false));
        answers9.add(new Answer("NO2",false));
        answers9.add(new Answer("N2",false));
        answers9.add(new Answer("N2O",true));

        List<Answer> answers10 = new ArrayList<>();
        answers10.add(new Answer("Lý Nhân Tông" , false));
        answers10.add(new Answer("Lý Thánh Tông",true));
        answers10.add(new Answer("Trần Nhân Tông",false));
        answers10.add(new Answer("Trần Quốc Toản",false));

        list.add(new Question(1,"Who is the “Queen of Pop” ? ",answers1));
        list.add(new Question(2,"Cơ quan nội tạng nào có kích thước lớn nhất trong cơ thể con người ?",answers2));
        list.add(new Question(3,"Điền sô tiếp theo vào dãy sau: 1, 3, 6, 10, 15, ? ",answers3));
        list.add(new Question(4,"Tên hành tinh to nhất hệ mặt trời ? ",answers4));
        list.add(new Question(5,"Sóng âm KHÔNG thể truyền trong những môi trường nào ?",answers5));
        list.add(new Question(6,"Điền 2 số tiếp theo vào dãy sau: 2, 3, 5, 7, ?, ? ",answers6));
        list.add(new Question(7,"Chỉ thị “Nhật Pháp bắn nhau và hành động của chúng ta” được phát ra vào ngày nào ? ",answers7));
        list.add(new Question(8,"Âm thanh có tần số lớn hơn 20KHz gọi là gì ? ",answers8));
        list.add(new Question(9,"Khí nào có trong bóng cười ?",answers9));
        list.add(new Question(10,"Vị vua lập Quốc Tử giám năm 1076 ? ",answers10));

        return list;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_answer1:
                tvAnswer1.setBackgroundResource(R.drawable.bg_orange_coner_10);
                checkAnswer(tvAnswer1,mQuestion,mQuestion.getListAnswer().get(0));
                break;
            case R.id.tv_answer2:
                tvAnswer2.setBackgroundResource(R.drawable.bg_orange_coner_10);
                checkAnswer(tvAnswer2,mQuestion,mQuestion.getListAnswer().get(1));
                break;
            case R.id.tv_answer3:
                tvAnswer3.setBackgroundResource(R.drawable.bg_orange_coner_10);
                checkAnswer(tvAnswer3,mQuestion,mQuestion.getListAnswer().get(2));
                break;
            case R.id.tv_answer4:
                tvAnswer4.setBackgroundResource(R.drawable.bg_orange_coner_10);
                checkAnswer(tvAnswer4,mQuestion,mQuestion.getListAnswer().get(3));
                break;
        }
    }
    private void checkAnswer(final TextView textView , Question question , Answer answer){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (answer.isCorrect()){
                    textView.setBackgroundResource(R.drawable.bg_green_coner_30);
                    nextQuestion();
                }
                else{
                    textView.setBackgroundResource(R.drawable.bg_red_coner_30);
                    showAnswerCorrect(question);
                    gameover();
                }
            }
        },1000);

    }

    private void gameover() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                showDialog("GameOver!");
            }
        },1000);
    }

    private void nextQuestion() {
        if(curenQuestio == mlistQuestion.size()-1){
            showDialog("You Win !!!");
        }
        else{
            curenQuestio++;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    setDataQuestion(mlistQuestion.get(curenQuestio));

                }
            },1000);

        }
    }

    private void showAnswerCorrect(Question question) {
        if (question == null || question.getListAnswer() ==null || question.getListAnswer().isEmpty()){
            return;
        }
        if(question.getListAnswer().get(0).isCorrect()){
            tvAnswer1.setBackgroundResource(R.drawable.bg_green_coner_30);

        }
        else if(question.getListAnswer().get(1).isCorrect()){
            tvAnswer2.setBackgroundResource(R.drawable.bg_green_coner_30);
        }
        else if(question.getListAnswer().get(2).isCorrect()){
            tvAnswer3.setBackgroundResource(R.drawable.bg_green_coner_30);
        }
        else if(question.getListAnswer().get(3).isCorrect()){
            tvAnswer4.setBackgroundResource(R.drawable.bg_green_coner_30);
        }
    }
    private void showDialog(String message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(message);
        builder.setCancelable(false);

        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                curenQuestio = 0;
                setDataQuestion(mlistQuestion.get(curenQuestio));
                dialog.dismiss();
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}