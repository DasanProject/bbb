package ssm.dao;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
@Component
public interface Usermapper {
    List<Map> getAll();
}
