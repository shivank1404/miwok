/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.shiva.miwok;;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
       // Numberslistner clicklistner = new Numberslistner();
        TextView numbers = (TextView)findViewById(R.id.numbers);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersintent=new Intent(MainActivity.this,Numbers.class);
                startActivity(numbersintent);
            }
        });


        TextView fam = (TextView)findViewById(R.id.family);
        fam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent familyintent=new Intent(MainActivity.this,Family.class);
                startActivity(familyintent);
            }
        });




        TextView phras = (TextView)findViewById(R.id.phrases);
        phras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phrasesintent=new Intent(MainActivity.this,Phrases.class);
                startActivity(phrasesintent);
            }
        });



        final TextView col = (TextView)findViewById(R.id.colors);
        col.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent colintent=new Intent(MainActivity.this,Colors.class);
                startActivity(colintent);
            }
        });
    }
   // public void numberslist(View view)
    //{
      //  Intent i=new Intent (this,Numbers.class);
      //  startActivity(i);
  //  }
}