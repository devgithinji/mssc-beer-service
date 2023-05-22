package com.densoft.msscbeerservice.web.mappers;

import com.densoft.msscbeerservice.domain.Beer;
import com.densoft.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
