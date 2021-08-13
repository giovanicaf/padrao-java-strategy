package io.github.giovanicaf.service;

import io.github.giovanicaf.service.frete.Normal;
import io.github.giovanicaf.service.frete.Sedex;

public enum TipoFrete {

	NORMAL {
		@Override
		public Frete obterFrete() {
			return new Normal();
		}
	},
	SEDEX {
		@Override
		public Frete obterFrete() {
			return new Sedex();
		}
	};
	
	public abstract Frete obterFrete();
	
}
