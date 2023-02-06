package com.zaychin.mapper;

import com.zaychin.model.SimpleDestination;
import com.zaychin.model.SimpleSource;
import org.mapstruct.Mapper;

@Mapper
public interface SimpleSourceDestinationMapper {

    SimpleDestination sourceToDestination(SimpleSource source);
    SimpleSource destinationToSource(SimpleDestination destination);
}
