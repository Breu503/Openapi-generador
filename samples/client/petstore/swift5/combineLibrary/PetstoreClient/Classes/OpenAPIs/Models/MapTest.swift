//
// MapTest.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
import AnyCodable

public struct MapTest: Codable, Hashable {

    public enum MapOfEnumString: String, Codable, CaseIterable {
        case upper = "UPPER"
        case lower = "lower"
    }
    public var mapMapOfString: [String: [String: String]]?
    public var mapOfEnumString: [String: String]?
    public var directMap: [String: Bool]?
    public var indirectMap: StringBooleanMap?

    public init(mapMapOfString: [String: [String: String]]? = nil, mapOfEnumString: [String: String]? = nil, directMap: [String: Bool]? = nil, indirectMap: StringBooleanMap? = nil) {
        self.mapMapOfString = mapMapOfString
        self.mapOfEnumString = mapOfEnumString
        self.directMap = directMap
        self.indirectMap = indirectMap
    }
    public enum CodingKeys: String, CodingKey, CaseIterable {
        case mapMapOfString = "map_map_of_string"
        case mapOfEnumString = "map_of_enum_string"
        case directMap = "direct_map"
        case indirectMap = "indirect_map"
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(mapMapOfString, forKey: .mapMapOfString)
        try container.encodeIfPresent(mapOfEnumString, forKey: .mapOfEnumString)
        try container.encodeIfPresent(directMap, forKey: .directMap)
        try container.encodeIfPresent(indirectMap, forKey: .indirectMap)
    }



}