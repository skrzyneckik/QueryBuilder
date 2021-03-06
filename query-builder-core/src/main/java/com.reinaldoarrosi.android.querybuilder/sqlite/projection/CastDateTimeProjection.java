package com.reinaldoarrosi.android.querybuilder.sqlite.projection;

import java.util.List;

import com.reinaldoarrosi.android.querybuilder.Utils;

public class CastDateTimeProjection extends Projection {
	private Projection projection;

	public CastDateTimeProjection(Projection projection) {
		this.projection = projection;
	}

	@Override
	public String build() {
		String ret = (projection != null ? projection.build() : "");
		return "DATETIME(" + ret + ")";
	}

	@Override
	public List<Object> buildParameters() {
		if (projection != null)
			return projection.buildParameters();
		else
			return Utils.EMPTY_LIST;
	}
}
