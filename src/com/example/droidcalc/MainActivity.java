package com.example.droidcalc;

import android.app.Activity;
import android.os.Bundle;
import android.provider.Telephony.Sms.Conversations;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends Activity {
	
	EditText EditTextConta;
	Button Button0;
	Button Button1;
	Button Button2;
	Button Button3;
	Button Button4;
	Button Button5;
	Button Button6;
	Button Button7;
	Button Button8;
	Button Button9;
	Button ButtonCE;
	Button ButtonC;
	Button ButtonBack;
	Button ButtonDiv;
	Button ButtonMult;
	Button ButtonMinus;
	Button ButtonSum;
	Button ButtonDecimal;
	Button ButtonInverSignal;
	Button ButtonEqual;
	private float valor1;
	public static enum Operacao{
		NENHUMA(0), ADICAO(1), SUBTRACAO(2), MULTIPLICACAO(3), DIVISAO(4);
		
		private final int codigo;
		
		Operacao(int codigo) { this.codigo = codigo; };
		
		int codigo() {return codigo;};
		
		public static Operacao porCodigo(int codigo) {
		        for (Operacao operacao: Operacao.values()) {
		            if (codigo == operacao.codigo()) return operacao;
		        }
		        throw new IllegalArgumentException("codigo invalido");
		}
	}
	private Operacao operacao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
       
        EditTextConta = (EditText) findViewById(R.id.editTextConta);
        Button0 = (Button) findViewById(R.id.button0);
        Button1 = (Button) findViewById(R.id.button1);
        Button2 = (Button) findViewById(R.id.button2);
        Button3 = (Button) findViewById(R.id.button3);
        Button4 = (Button) findViewById(R.id.button4);
        Button5 = (Button) findViewById(R.id.button5);
        Button6 = (Button) findViewById(R.id.button6);
        Button7 = (Button) findViewById(R.id.button7);
        Button8 = (Button) findViewById(R.id.button8);
        Button9 = (Button) findViewById(R.id.button9);
        ButtonCE = (Button) findViewById(R.id.buttonCE);
        ButtonC = (Button) findViewById(R.id.buttonC);
        ButtonBack = (Button) findViewById(R.id.buttonBack);
        ButtonDiv = (Button) findViewById(R.id.buttonDiv);
        ButtonMult = (Button) findViewById(R.id.buttonMult);
        ButtonMinus = (Button) findViewById(R.id.buttonMinus);
        ButtonSum = (Button) findViewById(R.id.buttonSum);
        ButtonDecimal = (Button) findViewById(R.id.buttonDecimal);
        ButtonInverSignal = (Button) findViewById(R.id.buttonInvertSignal);
        ButtonEqual = (Button) findViewById(R.id.buttonEqual);
        
        Button1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				String s = EditTextConta.getText().toString();
				s = s.concat("1");
				EditTextConta.setText(s);
			}
		});
        
        Button2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				String s = EditTextConta.getText().toString();
				s = s.concat("2");
				EditTextConta.setText(s);
			}
		});
        
        Button3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				String s = EditTextConta.getText().toString();
				s = s.concat("3");
				EditTextConta.setText(s);
			}
		});
        
        Button4.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				String s = EditTextConta.getText().toString();
				s = s.concat("4");
				EditTextConta.setText(s);
			}
		});
        
        Button5.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				String s = EditTextConta.getText().toString();
				s = s.concat("5");
				EditTextConta.setText(s);
			}
		});
        Button6.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				String s = EditTextConta.getText().toString();
				s = s.concat("6");
				EditTextConta.setText(s);
			}
		});
        Button7.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				String s = EditTextConta.getText().toString();
				s = s.concat("7");
				EditTextConta.setText(s);
			}
		});
        Button8.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				String s = EditTextConta.getText().toString();
				s = s.concat("8");
				EditTextConta.setText(s);
			}
		});
        Button9.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				String s = EditTextConta.getText().toString();
				s = s.concat("9");
				EditTextConta.setText(s);
			}
		});
        
        Button0.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				String s = EditTextConta.getText().toString();
				s = s.concat("0");
				EditTextConta.setText(s);
			}
		});
        
        ButtonDecimal.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				String s = EditTextConta.getText().toString();
				s = s.concat(".");
				EditTextConta.setText(s);
			}
		});
        
        ButtonC.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				EditTextConta.setText("");
			}
		});

        ButtonCE.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				EditTextConta.setText("");
				valor1 = 0;
			}
		});
        

        ButtonBack.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				String s = EditTextConta.getText().toString();
				if (s.length() > 1) {
					s = s.substring(0, s.length()-2);
					EditTextConta.setText(s);
				}
			}
		});
        

        ButtonInverSignal.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				String s = EditTextConta.getText().toString();
				String menos = "-";
				if (s.substring(0, 0) == "-") {
					s = s.substring(1, s.length()-1);
					EditTextConta.setText(s);
				}else{
					s = menos.concat(s) ;
					EditTextConta.setText(s);
				}
			}
		});
        
        ButtonSum.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				String s = EditTextConta.getText().toString();
				valor1 = Float.parseFloat(s);
				EditTextConta.setText("+");
				operacao = Operacao.ADICAO;
			}
		});
        

        ButtonMinus.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				String s = EditTextConta.getText().toString();
				valor1 = Float.parseFloat(s);
				EditTextConta.setText("-");
				operacao = Operacao.SUBTRACAO;
			}
		});
        

        ButtonMult.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				String s = EditTextConta.getText().toString();
				valor1 = Float.parseFloat(s);
				EditTextConta.setText("*");
				operacao = Operacao.MULTIPLICACAO;
			}
		});
        

        ButtonDiv.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				String s = EditTextConta.getText().toString();
				valor1 = Float.parseFloat(s);
				EditTextConta.setText("/");
				operacao = Operacao.DIVISAO;
			}
		});
        
        ButtonEqual.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				String s = EditTextConta.getText().toString();
				float valor2 = Float.parseFloat(s.substring(1));
				if (operacao == Operacao.ADICAO) {
					valor1 = valor1 + valor2;
				}
				if (operacao == Operacao.SUBTRACAO) {
					valor1 = valor1 - valor2;
				}
				if (operacao == Operacao.MULTIPLICACAO) {
					valor1 = valor1 * valor2;
				}
				if (operacao == Operacao.DIVISAO) {
					valor1 = valor1 / valor2;
				}
 				
				EditTextConta.setText(Float.toString(valor1));
			}
		});
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
        

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
    
}
