package mobi.mrok.learnreader;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TabHost;

public class MainScreen extends Activity{
	// ������� ������ ���� � ����� ������� �� �����.

    @Override
    public void onCreate(Bundle savedInstanceState) { 
    	super.onCreate(savedInstanceState);
        setContentView(R.layout.main_screen);
        
        TabHost tabMainScreen = (TabHost) findViewById(R.id.tabMainScreen);
        //�������������
        tabMainScreen.setup();
        
        TabHost.TabSpec tabSpec;
        
        // ������� ������� � ��������� ���
        tabSpec = tabMainScreen.newTabSpec("FavoritesBooks");
        // �������� �������
        tabSpec.setIndicator(getString(R.string.Library));
        // ��������� id ���������� �� FrameLayout
        tabSpec.setContent(R.id.relativeActivityLibrary);
        //�������� � �������� �������
        tabMainScreen.addTab(tabSpec);
        
        tabSpec = tabMainScreen.newTabSpec("Learning");
        tabSpec.setIndicator(getString(R.string.Learning));
        tabSpec.setContent(R.id.relativeLearning);
        tabMainScreen.addTab(tabSpec);
        
        tabSpec = tabMainScreen.newTabSpec("Dictionary");
        tabSpec.setIndicator(getString(R.string.Dictionary));
        tabSpec.setContent(R.id.relativeDictionary);
        tabMainScreen.addTab(tabSpec);        
        tabMainScreen.setCurrentTabByTag("FavoritesBooks");
        
        // ��������� ������� ��� �� ������ ������
        TabHost tabFavorite = (TabHost) findViewById(R.id.tabFavorite);
        tabFavorite.setup();       
        tabSpec = tabFavorite.newTabSpec("TableOfBooks");
        tabSpec.setIndicator(getString(R.string.Books));
        tabSpec.setContent(R.id.relativeLibrary);
        tabFavorite.addTab(tabSpec);
                     
        tabSpec = tabFavorite.newTabSpec("TableOfArticles");
        tabSpec.setIndicator(getString(R.string.Articles));
        tabSpec.setContent(R.id.relativeLibraryFavoriteArticles);
        tabFavorite.addTab(tabSpec);
        
        // ��������� ������� ��� �� ������ ������
        TabHost tabLearning = (TabHost) findViewById(R.id.tabLearning);
        tabLearning.setup();
        tabSpec = tabLearning.newTabSpec("Lessons");
        tabSpec.setIndicator(getString(R.string.Lessons));
        tabSpec.setContent(R.id.relativeLearningLessons);
        tabLearning.addTab(tabSpec);
        
        tabSpec = tabLearning.newTabSpec("Statistics");
        tabSpec.setIndicator(getString(R.string.Statistics));
        tabSpec.setContent(R.id.relativeLearningStatistics);
        tabLearning.addTab(tabSpec);
        
        
        
        /* ���������� ������������ �������
        tabMainScreen.setOnTabChangedListener(new OnTabChangeListener(){
        	public void onTabChanged(String tabId){
        		Toast.makeText(getBaseContext(), tabId, Toast.LENGTH_SHORT).show();*/
        	}
        ;
        
    

    public boolean onCreateOptionsMenu(Menu menu) {
    	getMenuInflater().inflate(R.menu.ab_main_screen, menu);
    	return true;
    }
	
}
