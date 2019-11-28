package com.yuzo.stu.service.impl;

import com.yuzo.stu.entity.Ming;
import com.yuzo.stu.entity.Xing;
import com.yuzo.stu.mapper.MingMapper;
import com.yuzo.stu.mapper.XingMapper;
import com.yuzo.stu.service.IXingMingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class XingMingServiceImpl  implements IXingMingService {
    @Autowired
    private XingMapper xingMapper;

    @Autowired
    private MingMapper mingMapper;

    @Override
    public int add(Xing xing) {
        return xingMapper.save(xing);
    }

    @Override
    public int addMing(Ming ming) {
        return mingMapper.save(ming);
    }
}
