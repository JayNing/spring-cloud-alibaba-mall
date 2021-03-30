package com.ning.mall.goods.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ning.mall.goods.model.Brand;

import java.util.List;

/**
 * ClassName: BrandService
 * Description:
 * date: 2021/3/30 13:18
 *
 * @author ningjianjian
 */
public interface BrandService extends IService<Brand> {

    List<Brand> queryList(Brand brand);

    Page<Brand> queryPageList(Brand brand, Long pageNum, Long pageSize);

}
