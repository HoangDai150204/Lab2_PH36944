package com.hoangdai.lab2_ph36944;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.util.LruCacheKt;

public class Bai2 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai2);
        TextView txtht=findViewById(R.id.txtht);
        EditText edtName=findViewById(R.id.edtName);
        EditText edtId=findViewById(R.id.edtId);
        EditText edtAge=findViewById(R.id.edtAge);
        RadioButton rdoMen=findViewById(R.id.rdoMen);
        RadioButton rdoGirl=findViewById(R.id.rdoGirl);
        CheckBox chkft=findViewById(R.id.chkft);
        CheckBox chkgame=findViewById(R.id.chkgame);
        Button btnSave=findViewById(R.id.btnSave);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            String name=edtName.getText().toString();
            String id=edtId.getText().toString();
            String Age=edtAge.getText().toString();
            String gt = rdoMen.isChecked()
                    ? rdoMen.getText().toString()
                    : rdoGirl.isChecked()
                    ? rdoGirl.getText().toString()
                    : "Chưa lựa chọn giới tính";
            String st = chkft.isChecked() && chkgame.isChecked()
                    ? "Đá bóng và chơi game"
                    : chkft.isChecked()
                    ? chkft.getText().toString()
                    :chkgame.isChecked()
                    ? chkgame.getText().toString()
                    : "Không thích gì cả";
            txtht.setText("Tên: " + name + "\n"
                            + "MSSV: " + id + "\n"
                            + "Tuổi: " + Age + "\n"
                            + "Giới tính: " + gt + "\n"
                            + "Sở thích: "+ st + "\n");
            }
        });
    }
}
