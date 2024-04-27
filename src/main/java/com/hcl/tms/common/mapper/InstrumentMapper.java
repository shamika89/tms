package com.hcl.tms.common.mapper;

import com.hcl.tms.entity.Instrument;
import com.hcl.tms.viewmodel.InstrumentModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface InstrumentMapper {
    InstrumentMapper INSTANCE = Mappers.getMapper(InstrumentMapper.class);

    InstrumentModel entityToModel(Instrument entity);
    InstrumentModel modelToEntity(InstrumentModel entity);
}
