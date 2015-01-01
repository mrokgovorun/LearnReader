package mobi.mrok.learnreader;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TabHost;

public class MainScreen extends Activity{
	// рабоча€ верси€ есть в копии проекта на диске.

    @Override
    public void onCreate(Bundle savedInstanceState) { 
    	super.onCreate(savedInstanceState);
        setContentView(R.layout.main_screen);
        
        TabHost tabMainScreen = (TabHost) findViewById(R.id.tabMainScreen);
        //инициализаци€
        tabMainScreen.setup();
        
        TabHost.TabSpec tabSpec;
        
        // создаем вкладку и указываем тег
        tabSpec = tabMainScreen.newTabSpec("FavoritesBooks");
        // название вкладки
        tabSpec.setIndicator(getString(R.string.Library));
        // указываем id компонента из FrameLayout
        tabSpec.setContent(R.id.relativeActivityLibrary);
        //обавл€ем в корневой элемент
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
        
        // вложенный двойной таб на первом экране
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
        
        // вложенный двойной таб на втором экране
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
        
        
        
        /* обработчик переключени€ вкладок
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
