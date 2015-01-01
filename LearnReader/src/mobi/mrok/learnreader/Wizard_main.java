package mobi.mrok.learnreader;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

// btnWizardSave - сохран€ет выбранную пару €зыков и открывает главный экран.

public class Wizard_main extends Activity implements OnClickListener {
	ImageButton btnWizardSave;
	
	public void onCreate(Bundle savedInstanceState){		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.wizard);	//                     ”казываем какой активити отображаетс€.
		btnWizardSave = (ImageButton) findViewById(R.id.btnWizardSave);   // находим вью по id
		btnWizardSave.setOnClickListener(this);                       // присваиваем listener кнопке. «а listener выступает активити.(this) 
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()){		
		case R.id.btnWizardSave:
			//TODO 1. открыть активити 3_0 2. —охранить выбранное.
			Intent intent = new Intent(this, MainScreen.class);
			startActivity(intent);
			break;
		default:
			break;		
		}
	}

}
