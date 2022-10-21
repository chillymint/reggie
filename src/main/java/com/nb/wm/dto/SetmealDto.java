package com.nb.wm.dto;

import com.nb.wm.entity.Setmeal;
import com.nb.wm.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
