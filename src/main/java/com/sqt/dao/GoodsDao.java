package com.sqt.dao;

import com.sqt.domain.Goods;

public interface GoodsDao {
     int updateGoods(Goods goods);
     Goods selectGoods(Integer id);
}
