package com.ning.mall.goods.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ning.mall.goods.model.Brand;
import com.ning.mall.goods.mapper.BrandMapper;
import com.ning.mall.goods.service.BrandService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: BrandServiceImpl
 * Description:
 * date: 2021/3/30 13:19
 *
 * @author ningjianjian
 */
@Service("brandService")
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements BrandService {

    @Autowired
    private BrandMapper brandMapper;

    @Override
    public List<Brand> queryList(Brand brand) {
        QueryWrapper<Brand> queryWrapper = new QueryWrapper<> ();
        if (brand == null){
            brand = new Brand();
        }
        if(!StringUtils.isEmpty(brand.getName())){
            queryWrapper.like("name",brand.getName());
        }
        if(!StringUtils.isEmpty(brand.getInitial())) {
            queryWrapper.eq("initial", brand.getInitial());
        }

        return brandMapper.selectList(queryWrapper);
    }

    @Override
    public Page<Brand> queryPageList(Brand brand, Long pageNum, Long pageSize) {
        QueryWrapper<Brand> queryWrapper = new QueryWrapper<> ();
        if (brand == null){
            brand = new Brand();
        }
        if(!StringUtils.isEmpty(brand.getName())){
            queryWrapper.like("name",brand.getName());
        }
        if(!StringUtils.isEmpty(brand.getInitial())) {
            queryWrapper.eq("initial", brand.getInitial());
        }
        Page<Brand> brandPage = brandMapper.selectPage(new Page<Brand>(pageNum, pageSize), queryWrapper);
        return brandPage;
    }
}
