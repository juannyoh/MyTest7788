package gson;

import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

public class MyEnumAdapterFactory implements TypeAdapterFactory {  
    
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {  
            Class<? super T> rawType = type.getRawType();  
            if(rawType ==SearchType.class){  
                    Type[] types = rawType.getGenericInterfaces();  
                    for(Type item:types){  
                            if(item == SearchType.class){  
                                    return new EnumTypeAdapter<T>();  
                            }  
                    }  
            }  
            return null;  
    }  
}
