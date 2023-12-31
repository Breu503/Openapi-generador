import {all, fork} from "redux-saga/effects";

import {
    behaviorApiAllSagas,
    petApiAllSagas,
    petPartApiAllSagas,
    storeApiAllSagas,
    userApiAllSagas,
} from "./index";

export function *allApiSagas() {
    yield all([
        fork(behaviorApiAllSagas),
        fork(petApiAllSagas),
        fork(petPartApiAllSagas),
        fork(storeApiAllSagas),
        fork(userApiAllSagas),
    ]);
}
