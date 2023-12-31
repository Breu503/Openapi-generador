/* tslint:disable */
/* eslint-disable */
/**
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists, mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface InlineObject3
 */
export interface InlineObject3 {
    /**
     * None
     * @type {number}
     * @memberof InlineObject3
     */
    integer?: number;
    /**
     * None
     * @type {number}
     * @memberof InlineObject3
     */
    int32?: number;
    /**
     * None
     * @type {number}
     * @memberof InlineObject3
     */
    int64?: number;
    /**
     * None
     * @type {number}
     * @memberof InlineObject3
     */
    number: number;
    /**
     * None
     * @type {number}
     * @memberof InlineObject3
     */
    _float?: number;
    /**
     * None
     * @type {number}
     * @memberof InlineObject3
     */
    _double: number;
    /**
     * None
     * @type {string}
     * @memberof InlineObject3
     */
    string?: string;
    /**
     * None
     * @type {string}
     * @memberof InlineObject3
     */
    patternWithoutDelimiter: string;
    /**
     * None
     * @type {string}
     * @memberof InlineObject3
     */
    _byte: string;
    /**
     * None
     * @type {Blob}
     * @memberof InlineObject3
     */
    binary?: Blob;
    /**
     * None
     * @type {Date}
     * @memberof InlineObject3
     */
    date?: Date;
    /**
     * None
     * @type {Date}
     * @memberof InlineObject3
     */
    dateTime?: Date;
    /**
     * None
     * @type {string}
     * @memberof InlineObject3
     */
    password?: string;
    /**
     * None
     * @type {string}
     * @memberof InlineObject3
     */
    callback?: string;
}

export function InlineObject3FromJSON(json: any): InlineObject3 {
    return InlineObject3FromJSONTyped(json, false);
}

export function InlineObject3FromJSONTyped(json: any, ignoreDiscriminator: boolean): InlineObject3 {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'integer': !exists(json, 'integer') ? undefined : json['integer'],
        'int32': !exists(json, 'int32') ? undefined : json['int32'],
        'int64': !exists(json, 'int64') ? undefined : json['int64'],
        'number': json['number'],
        '_float': !exists(json, 'float') ? undefined : json['float'],
        '_double': json['double'],
        'string': !exists(json, 'string') ? undefined : json['string'],
        'patternWithoutDelimiter': json['pattern_without_delimiter'],
        '_byte': json['byte'],
        'binary': !exists(json, 'binary') ? undefined : json['binary'],
        'date': !exists(json, 'date') ? undefined : (new Date(json['date'])),
        'dateTime': !exists(json, 'dateTime') ? undefined : (new Date(json['dateTime'])),
        'password': !exists(json, 'password') ? undefined : json['password'],
        'callback': !exists(json, 'callback') ? undefined : json['callback'],
    };
}

export function InlineObject3ToJSON(value?: InlineObject3 | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'integer': value.integer,
        'int32': value.int32,
        'int64': value.int64,
        'number': value.number,
        'float': value._float,
        'double': value._double,
        'string': value.string,
        'pattern_without_delimiter': value.patternWithoutDelimiter,
        'byte': value._byte,
        'binary': value.binary,
        'date': value.date === undefined ? undefined : (value.date.toISOString().substring(0,10)),
        'dateTime': value.dateTime === undefined ? undefined : (value.dateTime.toISOString()),
        'password': value.password,
        'callback': value.callback,
    };
}


