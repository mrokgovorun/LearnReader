package mobi.mrok.learnreader;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

// btnWizardSave - ��������� ��������� ���� ������ � ��������� ������� �����.

public class Wizard_main extends Activity implements OnClickListener {
	ImageButton btnWizardSave;
	
	public void onCreate(Bundle savedInstanceState){		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.wizard);	//                     ��������� ����� �������� ������������.
		btnWizardSave = (ImageButton) findViewById(R.id.btnWizardSave);   // ������� ��� �� id
		btnWizardSave.setOnClickListener(this);                       // ����������� listener ������. �� listener ��������� ��������.(this) 
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()){		
		case R.id.btnWizardSave:
			//TODO 1. ������� �������� 3_0 2. ��������� ���������.
			Intent intent = new Intent(this, MainScreen.class);
			startActivity(intent);
			break;
		default:
			break;		
		}
	}

}
