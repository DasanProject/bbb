package ssm.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.dao.Usermapper;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class UserBizImpl implements UserBiz {
    @Autowired
    private Usermapper usermapper;
    @Override
    public List<Map> getAll() {

            return usermapper.getAll();
        }



}
